package Reto2;

public class Cliente {
	//Declaración de los atributos necesarios para crear un perfil de cliente (admin, usuario, observador).
	private String NombreCliente;
	private String ApellidosCliente;
	private String DNICliente;
	private int[] TelefonoCliente = new int[9];
	private String emailCliente;
	private String Nick;
	private String Password;
	private String TipoCliente;
	
	public Cliente(String n, String a, String d, int[] t, String e, String nick, String pass, String tp) {
		this.NombreCliente = n;
		this.ApellidosCliente = a;
		this.DNICliente = d;
		this.TelefonoCliente = t;
		this.emailCliente = e;
		this.Nick = nick;
		this.Password = pass;
		this.TipoCliente = tp;
	}
}
