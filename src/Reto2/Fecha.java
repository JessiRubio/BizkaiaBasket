package Reto2;

public class Fecha {
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int min;
	
	public Fecha(int d, int m, int a, int h, int min) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
		this.hora = h;
		this.min = min;
	}
	
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
}
