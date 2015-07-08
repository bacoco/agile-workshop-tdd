package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DezOuVintePorcentoTest {

	private Funcionario funcionario;
	
	private final static double DELTA = 0.00000001;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testaSalarioMenorOuIgualA3000() {
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DESENVOLVEDOR).comSalarioBaseDe(3000).build();
		double calcula = funcionario.getSalarioCalculado();
		
		assertEquals(3000 * 0.9, calcula, DELTA);
	}
	
	@Test
	public void testaSalarioMaiorQue3000(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DESENVOLVEDOR).comSalarioBaseDe(3100).build();
		double calcula = funcionario.getSalarioCalculado();
		
		assertEquals(3100 * 0.8, calcula, DELTA);
	}

}
