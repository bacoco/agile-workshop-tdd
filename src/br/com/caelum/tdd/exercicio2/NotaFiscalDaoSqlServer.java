package br.com.caelum.tdd.exercicio2;

public class NotaFiscalDaoSqlServer implements Acao {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}

}
