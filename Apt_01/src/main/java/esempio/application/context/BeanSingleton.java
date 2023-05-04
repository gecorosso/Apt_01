package esempio.application.context;

public class BeanSingleton {
	private String messaggio;
	
	public String Saluti() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}
	
}
