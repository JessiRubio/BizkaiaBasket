package Reto2;

public class Jugador extends Persona implements Comparable <Jugador> {
	
	private String Nacionalidad;
	private String Equipo;
	private Fecha FechaNacimiento;
	private String  Altura;
	private String  Peso;
	private String Edad; 
	private int TirosTirados; 
	private int TirosMetidos; 
	private int TriplesTirados;
	private int TriplesMetidos; 
	private int RebotesCogidos; 

//Métodos, personalizados 
	public Jugador() {
		super();
		this.Nacionalidad = ""; 
		this.Equipo = ""; 
		this.FechaNacimiento = new Fecha(); 
		this.Altura = ""; 
		this.Peso = "";
		this.Edad = ""; 
		this.TirosTirados = 0;
		this.TirosMetidos = 0; 
		this.TriplesTirados = 0; 
		this.TriplesMetidos = 0; 
		this.RebotesCogidos = 0;	
	}
//Geters and Seters 

	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getEquipo() {
		return Equipo;
	}
	public void setEquipo(String equipo) {
		Equipo = equipo;
	}
	public Fecha getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getAltura() {
		return Altura;
	}
	public void setAltura(String altura) {
		Altura = altura;
	}
	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
	}

	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public int getTirosTirados() {
		return TirosTirados;
	}
	public void setTirosTirados(int tirosTirados) {
		TirosTirados = tirosTirados;
	}
	public int getTirosMetidos() {
		return TirosMetidos;
	}
	public void setTirosMetidos(int tirosMetidos) {
		TirosMetidos = tirosMetidos;
	}
	public int getTriplesTirados() {
		return TriplesTirados;
	}
	public void setTriplesTirados(int triplesTirados) {
		TriplesTirados = triplesTirados;
	}
	public int getTriplesMetidos() {
		return TriplesMetidos;
	}
	public void setTriplesMetidos(int triplesMetidos) {
		TriplesMetidos = triplesMetidos;
	}
	public int getRebotesCogidos() {
		return RebotesCogidos;
	}
	public void setRebotesCogidos(int rebotesCogidos) {
		RebotesCogidos = rebotesCogidos;
	}
//CompareTo DNI 
	@Override
	public int compareTo(Jugador other) {
		//Comparo el DNI 
		return super.compareTo(other);
	}
	
	

}
