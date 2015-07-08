package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuinzeOuVintePorcentoTest {

	private Funcionario funcionario;	
	private static double DELTA = 0.00000001;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testaSalarioMaiorQue5000() {
		funcionario = new FuncionarioBuilder().comCargo(Cargo.GERENTE_DE_PROJETOS).comSalarioBaseDe(5001).build();
		RegraDeCalculo calculadora = funcionario.getCargo().getRegra();
		
		double calcula = calculadora.calcula(funcionario);
		
		assertEquals(5001 * 0.80 , calcula, DELTA);
	}
	
	@Test
	public void testaSalario5000(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.GERENTE_DE_PROJETOS).comSalarioBaseDe(5000).build();
		RegraDeCalculo calculadora = funcionario.getCargo().getRegra();
		
		double calcula = calculadora.calcula(funcionario);
		
		assertEquals(5000 * 0.80, calcula, DELTA);
	}
	
	@Test
	public void testaSalarioMenorQue5000(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.GERENTE_DE_PROJETOS).comSalarioBaseDe(4999).build();
		RegraDeCalculo calculadora = funcionario.getCargo().getRegra();
		
		double calcula = calculadora.calcula(funcionario);
		
		assertEquals(4999 * 0.85, calcula, DELTA);
	}

}
