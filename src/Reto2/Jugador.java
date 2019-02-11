package Reto2;

public class Jugador implements Comparable <Jugador> {
	
	private String Nombre;
	private String Apellido;
	private String Nacionalidad;
	private String DNI;
	private String Equipo;
	private Fecha FechaNacimiento;
	private double  Altura;
	private int Edad; 
	private int TirosTirados; 
	private int TirosMetidos; 
	private int TriplesTirados;
	private int TriplesMetidos; 
	private int RebotesCogidos; 

//M�todos, personalizados 
	public Jugador(String n, String a, String na, String d, String e, Fecha f, double al, int ed, int tt, int tm, int tr, int trm, int r) {
		this.Nombre = n;
		this.Apellido = a; 
		this.Nacionalidad = na; 
		this.DNI = d; 
		this.Equipo = e; 
		this.FechaNacimiento = f; 
		this.Altura = al; 
		this.Edad = ed; 
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
