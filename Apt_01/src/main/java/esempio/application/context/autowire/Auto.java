package esempio.application.context.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="auto")
public class Auto {
	private Motore motore;
	private Ruota ruota;
	
//	@Autowired
//	public Auto(Motore motore) {
//		super();
//		this.motore = motore;
//	}
//
//	public Auto() {
//		super();
//	}	
//	@Autowired
//	public void setMotore(Motore motore) {
//		this.motore = motore;
//	}
	
	@Autowired
	public void metodoGenerico(Motore motore,Ruota ruota) {
		this.motore = motore;
		this.ruota = ruota;
	}
	

	public String scriViMessaggio() {
		return "Ciao sono Auto "+ "con " + motore.getMessaggio() + ruota.getMyRuota();
	}
	
	
	
	
}
