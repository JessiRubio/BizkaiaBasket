package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Reto2.Liga;

class PruebasLiga {

	@Test
	void testNotEqualsLiga() {
		Liga lig1 = new Liga();
		lig1.setNombreLiga("Primera");
		lig1.setGrupo("A");
		lig1.setCodigo("a10");
		
		Liga lig2 = new Liga();
		lig2.setNombreLiga("Primera");
		lig2.setGrupo("A");
		lig2.setCodigo("a15");
		// Comprobamos que hace bien la igualdad y devuelve que no son iguales
		assertNotEquals(lig1,lig2);
	}
	
	@Test
	void testEqualsLiga() {
		Liga lig1 = new Liga();
		lig1.setNombreLiga("Primera");
		lig1.setGrupo("A");
		lig1.setCodigo("a10");
		
		Liga lig2 = new Liga();
		lig2.setNombreLiga("Primera");
		lig2.setGrupo("A");
		lig2.setCodigo("a10");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertEquals(lig1,lig2);
	}

}
