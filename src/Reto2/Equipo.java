package Reto2;

import java.util.ArrayList;

public class Equipo {
	//Declaración de los atributos necesarios para crear un equipo
	private String CodEquipo;
	private String NombreEquipo;
	private String Municipio;
	private int telefono;
	private String CorreoElectronico;
	private String TerrenoDeJuego;
	private ArrayList<Jugador> ListaJugadores;
	
	public Equipo() {
		CodEquipo = "";
		NombreEquipo = "";
		Municipio = "";
		telefono = 0;
		CorreoElectronico = "";
		TerrenoDeJuego = "";
	}

	public String getCodEquipo() {
		return CodEquipo;
	}

	public void setCodEquipo(String codEquipo) {
		CodEquipo = codEquipo;
	}

	public String getNombreEquipo() {
		return NombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		NombreEquipo = nombreEquipo;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}

	public String getTerrenoDeJuego() {
		return TerrenoDeJuego;
	}

	public void setTerrenoDeJuego(String terrenoDeJuego) {
		TerrenoDeJuego = terrenoDeJuego;
	}

	public ArrayList<Jugador> getListaJugadores() {
		return ListaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		ListaJugadores = listaJugadores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodEquipo == null) ? 0 : CodEquipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Equipo eq = (Equipo)obj;
		if (this.CodEquipo.equals(eq.CodEquipo)) {
			igual = true;
		}
		return igual;
	}
}
