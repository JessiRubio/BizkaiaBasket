package Reto2;

public class Cliente {
	//Declaración de los atributos necesarios para crear un perfil de cliente (admin, usuario, observador).
	private String NombreCliente;
	private String ApellidosCliente;
	private String DNICliente;
	private int TelefonoCliente;
	private String emailCliente;
	private String Nick;
	private String Password;
	private String TipoCliente;
	
	public Cliente(String n, String a, String d, int t, String e, String nick, String pass, String tp) {
		this.NombreCliente = n;
		this.ApellidosCliente = a;
		this.DNICliente = d;
		this.TelefonoCliente = t;
		this.emailCliente = e;
		this.Nick = nick;
		this.Password = pass;
		this.TipoCliente = tp;
	}
	public Cliente(String n, String p, String tp) {
		this.NombreCliente = "";
		this.ApellidosCliente = "";
		this.DNICliente = "";
		this.TelefonoCliente = 0;
		this.emailCliente = "";
		this.Nick = n;
		this.Password = p;
		this.TipoCliente = tp;
	}
	
	public String getNombreCliente() {
		return NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return ApellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		ApellidosCliente = apellidosCliente;
	}
	public String getDNICliente() {
		return DNICliente;
	}
	public void setDNICliente(String dNICliente) {
		DNICliente = dNICliente;
	}
	public int getTelefonoCliente() {
		return TelefonoCliente;
	}
	public void setTelefonoCliente(int telefonoCliente) {
		TelefonoCliente = telefonoCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getNick() {
		return Nick;
	}
	public void setNick(String nick) {
		Nick = nick;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		TipoCliente = tipoCliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ApellidosCliente == null) ? 0 : ApellidosCliente.hashCode());
		result = prime * result + ((DNICliente == null) ? 0 : DNICliente.hashCode());
		result = prime * result + ((Nick == null) ? 0 : Nick.hashCode());
		result = prime * result + ((NombreCliente == null) ? 0 : NombreCliente.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + TelefonoCliente;
		result = prime * result + ((TipoCliente == null) ? 0 : TipoCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Cliente cli = (Cliente)obj;
		if(this.DNICliente.equals(cli.DNICliente)) {
			iguales = true;
		}
		return iguales;
	}
	
	public boolean loginEquals(Cliente cliente) {
		boolean igual = false;
		if((this.Nick.equals(cliente.Nick)) && (this.Password.equals(cliente.Password))){
			igual = true;
		}
		return igual;
	}

}
