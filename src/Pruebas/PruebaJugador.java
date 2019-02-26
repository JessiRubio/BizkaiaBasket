package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Reto2.Fecha;
import Reto2.Jugador;

class PruebaJugador {

	@Test
	void testNotEqualsJugador() {
		Jugador j1 = new Jugador();
		j1.setNombre("Ruben");
		j1.setApellidos("Izcara");
		j1.setNacionalidad("Alemania");
		j1.setEquipo("Colegio Aleman");
		Fecha f1 = new Fecha();
		f1.setAño(1990);
		f1.setMes(6);
		f1.setDia(15);
		j1.setFechaNacimiento(f1);
		j1.setAltura("180");
		j1.setPeso("70 Kilos");
		j1.setEdad("25 Años");
		j1.setTirosTirados(3);
		j1.setTirosMetidos(2);
		j1.setTriplesTirados(4);
		j1.setTriplesMetidos(2);
		j1.setRebotesCogidos(1);
		j1.setDNI("1234567A");
		Jugador j2 = new Jugador();
		j2.setNombre("Lucian");
		j2.setApellidos("Hanzi");
		j2.setNacionalidad("España");
		j2.setEquipo("Miribilla");
		Fecha f2 = new Fecha();
		f2.setAño(1995);
		f2.setMes(11);
		f2.setDia(1);
		j2.setFechaNacimiento(f1);
		j2.setAltura("185");
		j2.setPeso("75 Kilos");
		j2.setEdad("23 Años");
		j2.setTirosTirados(2);
		j2.setTirosMetidos(2);
		j2.setTriplesTirados(5);
		j2.setTriplesMetidos(3);
		j2.setRebotesCogidos(6);
		j2.setDNI("54321567B");
		// Comprobamos que hace bien la igualdad y devuelve que no son iguales
		assertNotEquals(j1,j2);
	}
	@Test
	void testEqualsJugador() {
		Jugador j1 = new Jugador();
		j1.setNombre("Ruben");
		j1.setApellidos("Izcara");
		j1.setNacionalidad("Alemania");
		j1.setEquipo("Colegio Aleman");
		Fecha f1 = new Fecha();
		f1.setAño(1990);
		f1.setMes(6);
		f1.setDia(15);
		j1.setFechaNacimiento(f1);
		j1.setAltura("180");
		j1.setPeso("70 Kilos");
		j1.setEdad("25 Años");
		j1.setTirosTirados(3);
		j1.setTirosMetidos(2);
		j1.setTriplesTirados(4);
		j1.setTriplesMetidos(2);
		j1.setRebotesCogidos(1);
		j1.setDNI("1234567A");
		Jugador j2 = new Jugador();
		j2.setNombre("Lucian");
		j2.setApellidos("Hanzi");
		j2.setNacionalidad("España");
		j2.setEquipo("Miribilla");
		Fecha f2 = new Fecha();
		f2.setAño(1995);
		f2.setMes(11);
		f2.setDia(1);
		j2.setFechaNacimiento(f1);
		j2.setAltura("185");
		j2.setPeso("75 Kilos");
		j2.setEdad("23 Años");
		j2.setTirosTirados(2);
		j2.setTirosMetidos(2);
		j2.setTriplesTirados(5);
		j2.setTriplesMetidos(3);
		j2.setRebotesCogidos(6);
		j2.setDNI("54321567B");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertNotEquals(j1,j2);
	}
	
	@Test
	void testMenorJugador() {
		Jugador j1 = new Jugador();
		j1.setNombre("Ruben");
		j1.setApellidos("Izcara");
		j1.setNacionalidad("Alemania");
		j1.setEquipo("Colegio Aleman");
		Fecha f1 = new Fecha();
		f1.setAño(1990);
		f1.setMes(6);
		f1.setDia(15);
		j1.setFechaNacimiento(f1);
		j1.setAltura("180");
		j1.setPeso("70 Kilos");
		j1.setEdad("25 Años");
		j1.setTirosTirados(3);
		j1.setTirosMetidos(2);
		j1.setTriplesTirados(4);
		j1.setTriplesMetidos(2);
		j1.setRebotesCogidos(1);
		j1.setDNI("1234567A");
		Jugador j2 = new Jugador();
		j2.setNombre("Lucian");
		j2.setApellidos("Hanzi");
		j2.setNacionalidad("España");
		j2.setEquipo("Miribilla");
		Fecha f2 = new Fecha();
		f2.setAño(1995);
		f2.setMes(11);
		f2.setDia(1);
		j2.setFechaNacimiento(f1);
		j2.setAltura("185");
		j2.setPeso("75 Kilos");
		j2.setEdad("23 Años");
		j2.setTirosTirados(2);
		j2.setTirosMetidos(2);
		j2.setTriplesTirados(5);
		j2.setTriplesMetidos(3);
		j2.setRebotesCogidos(6);
		j2.setDNI("54321567B");
		//  Comprobamos que hace bien la comparacion y j1 es menor que j2
		assertNotEquals(j1,j2);
	}

	@Test
	void testMayorJugador() {
		Jugador j1 = new Jugador();
		j1.setNombre("Ruben");
		j1.setApellidos("Izcara");
		j1.setNacionalidad("Alemania");
		j1.setEquipo("Colegio Aleman");
		Fecha f1 = new Fecha();
		f1.setAño(1990);
		f1.setMes(6);
		f1.setDia(15);
		j1.setFechaNacimiento(f1);
		j1.setAltura("180");
		j1.setPeso("70 Kilos");
		j1.setEdad("25 Años");
		j1.setTirosTirados(3);
		j1.setTirosMetidos(2);
		j1.setTriplesTirados(4);
		j1.setTriplesMetidos(2);
		j1.setRebotesCogidos(1);
		j1.setDNI("1234567A");
		Jugador j2 = new Jugador();
		j2.setNombre("Lucian");
		j2.setApellidos("Hanzi");
		j2.setNacionalidad("España");
		j2.setEquipo("Miribilla");
		Fecha f2 = new Fecha();
		f2.setAño(1995);
		f2.setMes(11);
		f2.setDia(1);
		j2.setFechaNacimiento(f1);
		j2.setAltura("185");
		j2.setPeso("75 Kilos");
		j2.setEdad("23 Años");
		j2.setTirosTirados(2);
		j2.setTirosMetidos(2);
		j2.setTriplesTirados(5);
		j2.setTriplesMetidos(3);
		j2.setRebotesCogidos(6);
		j2.setDNI("54321567B");
		// Comprobamos que hace bien la comparacion y f2 es menor que f1
		assertNotEquals(j1,j2);
	}
	
	@Test
	void testIgualJugador() {
		Jugador j1 = new Jugador();
		j1.setNombre("Ruben");
		j1.setApellidos("Izcara");
		j1.setNacionalidad("Alemania");
		j1.setEquipo("Colegio Aleman");
		Fecha f1 = new Fecha();
		f1.setAño(1990);
		f1.setMes(6);
		f1.setDia(15);
		j1.setFechaNacimiento(f1);
		j1.setAltura("180");
		j1.setPeso("70 Kilos");
		j1.setEdad("25 Años");
		j1.setTirosTirados(3);
		j1.setTirosMetidos(2);
		j1.setTriplesTirados(4);
		j1.setTriplesMetidos(2);
		j1.setRebotesCogidos(1);
		j1.setDNI("1234567A");
		Jugador j2 = new Jugador();
		j2.setNombre("Lucian");
		j2.setApellidos("Hanzi");
		j2.setNacionalidad("España");
		j2.setEquipo("Miribilla");
		Fecha f2 = new Fecha();
		f2.setAño(1995);
		f2.setMes(11);
		f2.setDia(1);
		j2.setFechaNacimiento(f1);
		j2.setAltura("185");
		j2.setPeso("75 Kilos");
		j2.setEdad("23 Años");
		j2.setTirosTirados(2);
		j2.setTirosMetidos(2);
		j2.setTriplesTirados(5);
		j2.setTriplesMetidos(3);
		j2.setRebotesCogidos(6);
		j2.setDNI("54321567B");
		// Comprobamos que hace bien la igualdad y devuelve que son iguales
		assertNotEquals(j1,j2);
	}

}
