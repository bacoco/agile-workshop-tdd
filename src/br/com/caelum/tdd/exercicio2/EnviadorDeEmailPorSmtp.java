package br.com.caelum.tdd.exercicio2;

public class EnviadorDeEmailPorSmtp implements Acao {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}

}
