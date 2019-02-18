package Reto2;

public class Partido implements Comparable <Partido> {
	
	//Declaración de los atributos necesarios para crear un partido
	private int CodPartido;
	private Equipo EquipoLocal;
	private Equipo EquipoVisitante;
	private Fecha FechaPartido;
	private int ResultadoEquipoLocal;
	private int ResultadoEquipoVisitante;
// método personalizado de partido
	public Partido () {
		this.CodPartido = 0; 
		this.EquipoLocal = new Equipo (); 
		this.EquipoVisitante = new Equipo (); 
		this.FechaPartido = new Fecha();  
		this.ResultadoEquipoLocal = 0; 
		this.ResultadoEquipoVisitante = 0; 
		}
//Setters and Getters de partido
	public int getCodPartido() {
		return CodPartido;
	}
	public void setCodPartido(int codPartido) {
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
		result = prime * result + CodPartido;
		result = prime * result + ((EquipoLocal == null) ? 0 : EquipoLocal.hashCode());
		result = prime * result + ((EquipoVisitante == null) ? 0 : EquipoVisitante.hashCode());
		result = prime * result + ((FechaPartido == null) ? 0 : FechaPartido.hashCode());
		result = prime * result + ResultadoEquipoLocal;
		result = prime * result + ResultadoEquipoVisitante;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		if (CodPartido != other.CodPartido)
			return false;
		if (EquipoLocal == null) {
			if (other.EquipoLocal != null)
				return false;
		} else if (!EquipoLocal.equals(other.EquipoLocal))
			return false;
		if (EquipoVisitante == null) {
			if (other.EquipoVisitante != null)
				return false;
		} else if (!EquipoVisitante.equals(other.EquipoVisitante))
			return false;
		if (FechaPartido == null) {
			if (other.FechaPartido != null)
				return false;
		} else if (!FechaPartido.equals(other.FechaPartido))
			return false;
		if (ResultadoEquipoLocal != other.ResultadoEquipoLocal)
			return false;
		if (ResultadoEquipoVisitante != other.ResultadoEquipoVisitante)
			return false;
		return true;
	}
//CompareTo de Partido
// Que compara el código de un equipo 
		@Override
		public int compareTo(Partido other) {
			int comparacion = 0; 
		if (this.CodPartido > other.CodPartido) {
			comparacion =1; 
		}
		else if (this.CodPartido < other.CodPartido) { 
			comparacion = -1; 	
		}
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