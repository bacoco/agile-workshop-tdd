package br.com.caelum.tdd.exercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DezOuVintePorcentoTest {

	private Funcionario funcionario;
	
	DezOuVintePorcento dezOuVintePorcento;
	
	private final static double DELTA = 0.00000001;
	
	@Before
	public void setUp() throws Exception {
		dezOuVintePorcento = new DezOuVintePorcento();
	}

	@Test
	public void testaSalarioMenorOuIgualA3000() {
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DESENVOLVEDOR).comSalarioBaseDe(3000).build();
		double calcula = dezOuVintePorcento.calcula(funcionario);
		
		assertEquals(3000 * 0.9, calcula, DELTA);
	}
	
	@Test
	public void testaSalarioMaiorQue3000(){
		funcionario = new FuncionarioBuilder().comCargo(Cargo.DESENVOLVEDOR).comSalarioBaseDe(3100).build();
		
		double calcula = dezOuVintePorcento.calcula(funcionario);
		
		assertEquals(3100 * 0.8, calcula, DELTA);
	}

}
