package br.com.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, 6);
		
		Assert.assertEquals(10, soma);
	}
}
