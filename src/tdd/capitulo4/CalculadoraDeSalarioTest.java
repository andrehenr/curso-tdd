package tdd.capitulo4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraDeSalarioTest {
	
	@Test
	public void deveCalcularSalarioDeDesenvolvedoresAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = 
				new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}

}
