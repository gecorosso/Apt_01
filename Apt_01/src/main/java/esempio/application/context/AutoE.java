package esempio.application.context;

public class AutoE {
	private AutoC auto_c;
    
	
	public AutoE(AutoC auto_c) {
		super();
		this.auto_c = auto_c;
	}


	public String saLuto() {
		return "Ciao sono il saluto di E"+"===>"+auto_c.Saluto();
	}
}
