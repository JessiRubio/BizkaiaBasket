package Reto2;

public class Partido implements Comparable <Partido> {
	
	//Declaración de los atributos necesarios para crear un partido
	private String CodPartido;
	private Equipo EquipoLocal;
	private Equipo EquipoVisitante;
	private Fecha FechaPartido;
	private int ResultadoEquipoLocal;
	private int ResultadoEquipoVisitante;

	
	// método personalizado de partido
	public Partido () {
		this.CodPartido = ""; 
		this.EquipoLocal = new Equipo (); 
		this.EquipoVisitante = new Equipo (); 
		this.FechaPartido = new Fecha();  
		this.ResultadoEquipoLocal = 0; 
		this.ResultadoEquipoVisitante = 0; 
		}
	
//Setters and Getters de partido
	public String getCodPartido() {
		return CodPartido;
	}
	public void setCodPartido(String codPartido) {
		CodPartido = codPartido;
	}
	public Equipo getEquipoLocal() {
		return EquipoLocal;
	}
	public void setEquipoLocal(Equipo equipoLocal) {
		EquipoLocal = equipoLocal;
	}
	public Equipo getEquipoVisitante() {
		return EquipoVisitante;
	}
	public void setEquipoVisitante(Equipo equipoVisitante) {
		EquipoVisitante = equipoVisitante;
	}
	public Fecha getFechaPartido() {
		return FechaPartido;
	}
	public void setFechaPartido(Fecha fechaPartido) {
		FechaPartido = fechaPartido;
	}
	public int getResultadoEquipoLocal() {
		return ResultadoEquipoLocal;
	}
	public void setResultadoEquipoLocal(int resultadoEquipoLocal) {
		ResultadoEquipoLocal = resultadoEquipoLocal;
	}
	public int getResultadoEquipoVisitante() {
		return ResultadoEquipoVisitante;
	}
	public void setResultadoEquipoVisitante(int resultadoEquipoVisitante) {
		ResultadoEquipoVisitante = resultadoEquipoVisitante;
	}
	
//Equals.HashCode de partido
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodPartido == null) ? 0 : CodPartido.hashCode());
		result = prime * result + ((EquipoLocal == null) ? 0 : EquipoLocal.hashCode());
		result = prime * result + ((EquipoVisitante == null) ? 0 : EquipoVisitante.hashCode());
		result = prime * result + ((FechaPartido == null) ? 0 : FechaPartido.hashCode());
		result = prime * result + ResultadoEquipoLocal;
		result = prime * result + ResultadoEquipoVisitante;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Partido par = (Partido) obj;
		
		return this.CodPartido.equals(par.CodPartido);
	}
	
//CompareTo de Partido
// Que compara el código de un equipo 
	@Override
	public int compareTo(Partido other) {
		int comparacion = this.CodPartido.compareTo(other.CodPartido);
	return comparacion;	
	}
//CompareTo de Victoria/Derrota 
   public int compareTo1 (Partido victoria) {
	  int comparacion = 0; 
	 if (ResultadoEquipoLocal > ResultadoEquipoVisitante) {
		 comparacion = 1; 
	 }
	 else if (ResultadoEquipoLocal < ResultadoEquipoVisitante) {
		 comparacion = -1; 
	 }
	return comparacion;	   
   }


   
}