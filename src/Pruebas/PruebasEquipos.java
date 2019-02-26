package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Reto2.Equipo;

class PruebasEquipos {

	@Test
	void testNotEqualsEquipo() {
		Equipo eq1 = new Equipo();
		eq1.setNombreEquipo("Begoñazpi");
		eq1.setTerrenoDeJuego("TxurdinagaCB");
		eq1.setCodEquipo("a40");
		
		Equipo eq2 = new Equipo();
		eq2.setNombreEquipo("Kirikiño");
		eq2.setTerrenoDeJuego("TxurdinagaCB");
		eq2.setCodEquipo("a41");
		// Comprobamos que hace bien la igualdad y devuelve que no son iguales
		assertNotEquals(eq1,eq2);
	}
	
	@Test
	void testEqualsEquipo() {
		Equipo eq1 = new Equipo();
		eq1.setNombreEquipo("Begoñazpi");
		eq1.setTerrenoDeJuego("TxurdinagaCB");
		eq1.setCodEquipo("a41");
		
		Equipo eq2 = new Equipo();
		eq2.setNombreEquipo("Kirikiño");
		eq2.setTerrenoDeJuego("TxurdinagaCB");
		eq2.setCodEquipo("a41");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertEquals(eq1,eq2);
	}
	
	// CompareTo de PartidosGanados y PartidosPerdidos
	@Test
	void testMenorEquipo() {
		Equipo eq1 = new Equipo();
		eq1.setNombreEquipo("Begoñazpi");
		eq1.setTerrenoDeJuego("TxurdinagaCB");
		eq1.setCodEquipo("41");
		eq1.setPartidosGanados(5);
		eq1.setPartidosPerdidos(8);
		
		Equipo eq2 = new Equipo();
		eq2.setNombreEquipo("Kirikiño");
		eq2.setTerrenoDeJuego("TxurdinagaCB");
		eq2.setCodEquipo("42");
		eq2.setPartidosGanados(8);
		eq2.setPartidosPerdidos(10);
		// Comprobamos que hace bien la comparacion y eq1 es menor que eq2
		assertTrue(eq1.compareTo(eq2) == -1);
	}
	
	@Test
	void testMayorEquipo() {
		Equipo eq1 = new Equipo();
		eq1.setNombreEquipo("Begoñazpi");
		eq1.setTerrenoDeJuego("TxurdinagaCB");
		eq1.setCodEquipo("41");
		eq1.setPartidosGanados(5);
		eq1.setPartidosPerdidos(3);
		
		Equipo eq2 = new Equipo();
		eq2.setNombreEquipo("Kirikiño");
		eq2.setTerrenoDeJuego("TxurdinagaCB");
		eq2.setCodEquipo("42");
		eq2.setPartidosGanados(8);
		eq2.setPartidosPerdidos(6);
		// Comprobamos que hace bien la comparacion y eq2 es menor que eq1
		assertTrue(eq2.compareTo(eq1) == 1);
	}
	
	@Test
	void testIgualEquipo() {
		Equipo eq1 = new Equipo();
		eq1.setNombreEquipo("Begoñazpi");
		eq1.setTerrenoDeJuego("TxurdinagaCB");
		eq1.setCodEquipo("41");
		eq1.setPartidosGanados(5);
		eq1.setPartidosPerdidos(3);
		// Comprobamos que hace bien la comparacion y devuelve que son iguales
		assertTrue(eq1.compareTo(eq1) == 0);
	}

}
