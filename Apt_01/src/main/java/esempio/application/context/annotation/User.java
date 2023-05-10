package esempio.application.context.annotation;


public class User {
    private Phone numero;
    
	public User(Phone numero) {
		super();
		this.numero = numero;
	}
	
	public String getTelefono() {
		return this.numero.getTelefono();
	}

	public String getUserInfo() {
		return "Graziano Aloisi";
	}
	
}
