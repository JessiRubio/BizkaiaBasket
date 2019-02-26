package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Reto2.Cliente;

class PruebaCliente {

	@Test
	void testNotEqualsCliente() {
		Cliente C1 = new Cliente(); 
		C1.setNick("User");
		C1.setPassword("User");
		C1.setDNI("123a");
		Cliente C2 = new Cliente(); 
		C2.setNick("Usuario");
		C2.setPassword("Usuario");
		C2.setDNI("123b");
		// Comprobamos que hace bien la igualdad y devuelve que no son iguales
		assertNotEquals(C1,C2); 
	}

	@Test
	void testEqualsCliente() {
		Cliente C1 = new Cliente();
		C1.setDNI("a1");
		C1.setNick("User");
		C1.setPassword("User1");
		Cliente C2 = new Cliente();
		C2.setDNI("a1");
		C2.setNick("Usuario");
		C2.setPassword("User2");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertEquals(C1, C2);
	}

	@Test
	void testMenorCliente() {
		Cliente C1 = new Cliente();
		C1.setNick("Jessica");
		C1.setPassword("Jessi123");
		C1.setDNI("a1");
		Cliente C2 = new Cliente();
		C2.setNick("Jessica");
		C2.setPassword("Jessi789");
		C2.setDNI("a2");
		// Comprobamos que hace bien la comparacion y p1 es menor que p2
		assertTrue(C1.compareTo(C2) == -1);
	}
	
	@Test
	void testMayorCliente() {
		Cliente C1 = new Cliente();
		C1.setNick("Jessica");
		C1.setPassword("Jessi123");
		C1.setDNI("a1");
		Cliente C2 = new Cliente();
		C2.setNick("Jessica");
		C2.setPassword("Jessi789");
		C2.setDNI("a2");
		// Comprobamos que hace bien la comparacion y p1 es menor que p2
		assertFalse(C1.compareTo(C2) == 1);
	}

}
