package esempio.application.context;

public class BeanPrototype {
	private String bean_proto = "messaggio di default";
	
	public String Saluto() {
		return bean_proto;
	}

	public void setMessaggio(String messaggio) {
		this.bean_proto = messaggio;
	}
	
	
	

}
