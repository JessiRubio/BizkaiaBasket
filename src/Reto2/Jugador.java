package Reto2;

public class Jugador implements Comparable <Jugador> {
	
	private String Nombre;
	private String Apellido;
	private String Nacionalidad;
	private String DNI;
	private String Equipo;
	private Fecha FechaNacimiento;
	private double  Altura;
	private double  Peso;
	private int Edad; 
	private int TirosTirados; 
	private int TirosMetidos; 
	private int TriplesTirados;
	private int TriplesMetidos; 
	private int RebotesCogidos; 

//Métodos, personalizados 
	public Jugador() {
		this.Nombre = "";
		this.Apellido = ""; 
		this.Nacionalidad = ""; 
		this.DNI = ""; 
		this.Equipo = ""; 
		this.FechaNacimiento = new Fecha(); 
		this.Altura = 0; 
		this.Peso = 0;
		this.Edad = 0; 
		this.TirosTirados = 0;
		this.TirosMetidos = 0; 
		this.TriplesTirados = 0; 
		this.TriplesMetidos = 0; 
		this.RebotesCogidos = 0;	
	}
//Geters and Seters 

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
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
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
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
		int comparacion = this.DNI.compareTo(other.DNI); 
		return comparacion;
	}
}
