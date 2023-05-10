package esempio.application.context;

import javax.annotation.Resource;

public class AutoB {
	
	private AutoA auto_a;
	private AutoC auto_c;
	
	//==Esempio con il setter
	
	public String Saluto() {
		return "Ciao Sono AutoB --->E mi sono importato -->"+ auto_a.Saluto() + "===" + auto_c.Saluto();
	}
	
	//==Adesso utilizzare il Setter Injection ossia devi dare la possibilità
	//==Al container di utilizzare il Setter InJection

	public void setAuto_A(AutoA auto_a) {
		this.auto_a = auto_a;
	}

	public void setAuto_C(AutoC auto_c) {
		this.auto_c = auto_c;
	}
	
	
	
	
}
