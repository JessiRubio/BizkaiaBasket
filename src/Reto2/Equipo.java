package Reto2;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo>{
	//Declaración de los atributos necesarios para crear un equipo
	private String CodEquipo;
	private String NombreEquipo;
	private String Municipio;
	private String Telefono;
	private String CorreoElectronico;
	private String TerrenoDeJuego;
	private ArrayList<Jugador> ListaJugadores;
	private String CodLiga;
	private int partidosGanados;
	private int PartidosPerdidos;
	
	public Equipo() {
		CodEquipo = "";
		NombreEquipo = "";
		Municipio = "";
		Telefono = "";
		CorreoElectronico = "";
		TerrenoDeJuego = "";
		CodLiga = "";
		partidosGanados = 0;
		PartidosPerdidos = 0;
	}

	
	//Getters and Setters
	
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

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
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

	public String getCodLiga() {
		return CodLiga;
	}
	
	public void setCodLiga(String codLiga) {
		CodLiga = codLiga;
	}
	
	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return PartidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		PartidosPerdidos = partidosPerdidos;
	}


	//toString
	@Override
	public String toString() {
		return NombreEquipo;
	}

	//HashCode and Equals
	
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
	
	//CompareTo
	public int compareTo(Equipo other) {
		int comparar = 0;
		if (this.partidosGanados >other.partidosGanados) {
			comparar = 1;
		}
		else if (this.partidosGanados<other.partidosGanados) {
			comparar = -1;
		}
		else {
			if(this.PartidosPerdidos<other.PartidosPerdidos) {
				comparar = 1;
			}
			else if(this.PartidosPerdidos>other.PartidosPerdidos) {
				comparar = -1;
			}
			else {
				comparar = this.NombreEquipo.compareTo(other.NombreEquipo);
			}
		}
		
		return comparar;
	}


	
}
