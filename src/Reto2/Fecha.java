package Reto2;

public class Fecha implements Comparable <Fecha> {
	
	// Propiedades 
	private int dia;
	private int mes;
	private int año;
	private int hora;
	private int min;
	
	// Contructoras
	//Por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 0;
		this.hora = 00;
		this.min = 00;
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
		this.año = ano;
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

	//toString
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + año + hora + "/" + min;
	}	
	
	
}
