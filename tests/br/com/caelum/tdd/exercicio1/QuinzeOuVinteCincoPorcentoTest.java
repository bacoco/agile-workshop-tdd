package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuinzeOuVinteCincoPorcentoTest {
	
	private static final double DELTA = 0.00000001;
	private Funcionario funcionario;

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void salarioMaiorQue2000(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DBA).comSalarioBaseDe(2001).build();
		double salarioCalculado = funcionario.getSalarioCalculado();
		
		assertEquals(2001 * 0.75, salarioCalculado, DELTA);
	}

	@Test
	public void salarioMenorQue2k(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DBA).comSalarioBaseDe(1999).build();
		double salarioCalculado = funcionario.getSalarioCalculado();
		
		assertEquals(1999 * 0.85, salarioCalculado, DELTA);
	}

}
