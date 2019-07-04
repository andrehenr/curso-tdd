package tdd.conversor;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ConversorNumeroRomano {
	
	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1,numero);
	}
	
	@Test
	public void deveEntenderOSimboloV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5,numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2,numero);
	}
	
	@Test
	public void deveEntenderSeteSimbolosComMCMXCIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("MCMXCIX");
		assertEquals(1999,numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22,numero);
	}
	
	@Test
	public void deveEntenderNumeroComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

}
