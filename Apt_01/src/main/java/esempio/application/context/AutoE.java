package esempio.application.context;

public class AutoE {
	private AutoC auto_c;
    
	//==Esempio autoware con DI del costruttore! 
	
	
	public AutoE(AutoC auto_c) {
		super();
		this.auto_c = auto_c;
	}


	public String saLuto() {
		return "Ciao sono il saluto di E"+"===>"+auto_c.Saluto();
	}
}
