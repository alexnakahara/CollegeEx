package testesEx01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ex01.Circulo;

class CirculoTeste {
	
	 Circulo circulo;
	
	@BeforeEach
	void preparar() {
		circulo = new Circulo(10);
	}

	@Test
	void testArea() {
		double resultado = circulo.area();
		assertEquals(314.1592653589793, resultado);
	}
	
	void testPerimetro() {
		double resultado = circulo.perimetro();
		assertEquals(62.83, resultado);
	}
	
	@AfterEach
	void clear() {
		circulo.setRaio(0);
		
	}

}
