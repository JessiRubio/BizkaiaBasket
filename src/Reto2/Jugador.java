package Reto2;

public class Jugador extends Persona implements Comparable <Jugador> {
	
	private String Nacionalidad;
	private String Equipo;
	private Fecha FechaNacimiento;
	private String Altura;
	private String Peso;
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
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public String getApellido() {
		return super.getApellidos();
	}
	
	public void setApellido(String apellido) {
		super.setApellidos(apellido);
	}
	
	public String getDni() {
		return super.getDNI();
	}
	
	public void setDni(String dni) {
		super.setDNI(dni);
	}
	
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

//HashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Altura == null) ? 0 : Altura.hashCode());
		result = prime * result + ((Edad == null) ? 0 : Edad.hashCode());
		result = prime * result + ((Equipo == null) ? 0 : Equipo.hashCode());
		result = prime * result + ((FechaNacimiento == null) ? 0 : FechaNacimiento.hashCode());
		result = prime * result + ((Nacionalidad == null) ? 0 : Nacionalidad.hashCode());
		result = prime * result + ((Peso == null) ? 0 : Peso.hashCode());
		result = prime * result + RebotesCogidos;
		result = prime * result + TirosMetidos;
		result = prime * result + TirosTirados;
		result = prime * result + TriplesMetidos;
		result = prime * result + TriplesTirados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	

}
