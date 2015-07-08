package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new QuinzeOuVinteCincoPorcento()),
	GERENTE_DE_PROJETOS(new QuinzeOuVintePorcento()),
	TESTER(new QuinzeOuVinteCincoPorcento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
