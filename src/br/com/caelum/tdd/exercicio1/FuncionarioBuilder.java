package br.com.caelum.tdd.exercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FuncionarioBuilder {
	private String nome = "Zé";
	private Cargo cargo = Cargo.DESENVOLVEDOR;
	private Calendar dataDeAdmissao = new GregorianCalendar(2000, 10, 01);
	private double salarioBase;

	public FuncionarioBuilder comNome(String nome) {
		this.nome = nome;
		return this;
	}

	public FuncionarioBuilder comCargo(Cargo cargo) {
		this.cargo = cargo;
		return this;
	}

	public FuncionarioBuilder admitidoEm(Calendar dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
		return this;
	}

	public FuncionarioBuilder comSalarioBaseDe(double salarioBase) {
		this.salarioBase = salarioBase;
		return this;
	}

	public Funcionario build() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(cargo);
		funcionario.setNome(nome);
		funcionario.setDataDeAdmissao(dataDeAdmissao);
		funcionario.setSalarioBase(salarioBase);
		return funcionario;
	}

}
