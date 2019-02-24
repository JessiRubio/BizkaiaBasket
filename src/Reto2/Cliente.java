package Reto2;

public class Cliente extends Persona{
	//Declaración de los atributos necesarios para crear un perfil de cliente (admin, usuario, observador).

	private String TelefonoCliente;
	private String emailCliente;
	private String Nick;
	private String Password;
	private String TipoCliente;
	
	public Cliente() {
		super();
		this.TelefonoCliente = "";
		this.emailCliente = "";
		this.Nick = "";
		this.Password = "";
		this.TipoCliente = "";
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
		int result = super.hashCode();
		result = prime * result + ((Nick == null) ? 0 : Nick.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((TelefonoCliente == null) ? 0 : TelefonoCliente.hashCode());
		result = prime * result + ((TipoCliente == null) ? 0 : TipoCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public boolean loginEquals(Cliente cliente) {
		boolean igual = false;
		if((this.Nick.equals(cliente.Nick)) && (this.Password.equals(cliente.Password))){
			igual = true;
		}
		return igual;
	}

}
