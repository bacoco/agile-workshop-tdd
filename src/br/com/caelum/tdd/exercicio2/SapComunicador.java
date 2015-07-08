package br.com.caelum.tdd.exercicio2;

public class SapComunicador implements Acao {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("envia nf pro sap");
	}

}
