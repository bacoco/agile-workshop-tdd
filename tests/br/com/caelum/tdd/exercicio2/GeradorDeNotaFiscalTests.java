package br.com.caelum.tdd.exercicio2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeradorDeNotaFiscalTests {

	private static final double PRECISAO = 0.00001;
	private GeradorDeNotaFiscal gerador;

	private List<Acao> acoes;
	private Acao acao2;
	private Acao acao;

	@Before
	public void setUp() {
		acoes = new ArrayList<Acao>();

		acao = mock(Acao.class);
		acao2 = mock(Acao.class);
		acoes.add(acao);
		acoes.add(acao2);

		gerador = new GeradorDeNotaFiscal(acoes);
	}

	@Test
	public void deveGerarNotaCom6PorCentoDeImposto() {
		Fatura fatura = new Fatura(1000, "cliente 1");

		NotaFiscal nf = gerador.gera(fatura);

		assertEquals(1000 * 0.06, nf.getImpostos(), PRECISAO);
	}

	@Test
	public void executouAcao() {

		Fatura fatura = new Fatura(1000, "cliente 1");
		NotaFiscal nf = gerador.gera(fatura);

		for (Acao acao : acoes) {
			verify(acao).executa(nf);
		}
	}
}
