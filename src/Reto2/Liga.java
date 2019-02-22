package Reto2;

import java.util.ArrayList;

public class Liga {
	//Declaración de los atributos necesarios para crear una Liga
	private String codigo;
	private String nombreLiga;
	private String CategoriaLiga;
	private String Grupo;
	private ArrayList<Equipo> ListaEquipos;
	private static int NumMaxEquipos = 20;

	public Liga() {
		this.codigo = "";
		this.nombreLiga = "";
		this.CategoriaLiga = "";
		this.Grupo = "";
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreLiga() {
		return nombreLiga;
	}

	public void setNombreLiga(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}

	public String getCategoriaLiga() {
		return CategoriaLiga;
	}

	public void setCategoriaLiga(String categoriaLiga) {
		CategoriaLiga = categoriaLiga;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public ArrayList<Equipo> getListaEquipos() {
		return ListaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		ListaEquipos = listaEquipos;
	}

	public static int getNumMaxEquipos() {
		return NumMaxEquipos;
	}

	public static void setNumMaxEquipos(int numMaxEquipos) {
		NumMaxEquipos = numMaxEquipos;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean comparador = false;
		Liga lig = (Liga)obj;
		if(this.codigo.equals(lig.codigo)) {
			comparador = true;
		}
		return comparador;
	}



	@Override
	public String toString() {
		return nombreLiga + " " + CategoriaLiga + " " + Grupo;
	}
	


}
