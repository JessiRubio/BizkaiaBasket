package Reto2;

public class Fecha implements Comparable <Fecha> {
	
	// Propiedades 
	private int dia;
	private int mes;
	private int año;
	private int hora;
	private int min;
	
	// métodos 
	// Personalizados 
	public Fecha(int d, int m, int a, int h, int min) {
		this.dia = d;
		this.mes = m;
		this.año = a;
		this.hora = h;
		this.min = min;
	}
	
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.año = a;
	}

//Geters an seters de la clase fecha

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int ano) {
		this.año = año;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
//CompareTo de la clase fecha 
	@Override
	public int compareTo(Fecha other) {
		// TODO Auto-generated method stub
		//comparo las propiedades de los objetos de la clase fecha 
		//comparo el año  
		int comparacion = 0; 
		if (this.año < other.año) {
			comparacion = 1; 
		}
		else { 
		// comparo el mes
			if(this.mes < other.mes) {
				comparacion = 1; 
			}
		// comparo el dia 
			else if (this.dia < other.dia) {
				comparacion = 1; 
			}
		// comparo hora 
				if (this.hora < other.hora) {
					comparacion =1; 
				}
		// comparo los minutos 
		else if (this.min < other.min) { 
			comparacion = 1; 
		}
		}
		return (comparacion);
	}		
}
