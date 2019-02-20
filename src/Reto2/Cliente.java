package Reto2;

public class Cliente {
	//Declaración de los atributos necesarios para crear un perfil de cliente (admin, usuario, observador).
	private String NombreCliente;
	private String ApellidosCliente;
	private String DNICliente;
	private String TelefonoCliente;
	private String emailCliente;
	private String Nick;
	private String Password;
	private String TipoCliente;
	
	public Cliente() {
		this.NombreCliente = "";
		this.ApellidosCliente = "";
		this.DNICliente = "";
		this.TelefonoCliente = "";
		this.emailCliente = "";
		this.Nick = "";
		this.Password = "";
		this.TipoCliente = "";
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
	public String getTelefonoCliente() {
		return TelefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
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
		result = prime * result + ((TelefonoCliente == null) ? 0 : TelefonoCliente.hashCode());
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
