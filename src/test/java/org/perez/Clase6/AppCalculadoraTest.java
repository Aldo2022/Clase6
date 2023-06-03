package org.perez.Clase6;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.perez.Clase6.Models.*;

public class AppCalculadoraTest {

	Calculadora calculadora = new Calculadora();
	@Test
	public void Test_Multiplicar() {
		
		Double a = 80.0;
		Double b = 3.0;
		Double resultado = 240.0;
		
		assertEquals(resultado,calculadora.multi(a, b)); 
	}
	
	@Test
	public void Test_SumarYDividir() {
	
		Double a = 150.0;
		Double b = 180.0;
		Double c = 3.0;
		Double resultado = 110.0;
		
		assertEquals(resultado,(calculadora.division(calculadora.sumar(a, b),c)));
	}
	
	@Test
	public void Test_RestarYMultiplicar() {
		
		Double a = 90.0;
		Double b = 50.0;
		Double c = 15.0;
		Double resultado = 605.0;
		
		assertEquals(resultado,(calculadora.multi(calculadora.restar(a, b), c)));
	}
	
	@Test
	public void sumarYMultiplicar() {
		
		Double a = 70.0;
		Double b = 40.0;
		Double c = 25.0;
		Double resultado = 2700.0;
		
		assertEquals(resultado,calculadora.multi(calculadora.sumar(a, b), c));
	}
}
/*Luego de haber implementado la Calculadora, realice los siguientes casos de prueba:
1. El resultado de multiplicar 80 por 3 da 240
2. El resultado de sumar 150 y 180, dividido por 3, da 110
3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.*/






