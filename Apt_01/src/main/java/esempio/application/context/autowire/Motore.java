package esempio.application.context.autowire;

import org.springframework.stereotype.Component;

@Component(value="motore")
public class Motore {
	
	public String getMessaggio() {
		return "Ciao Sono il motore iniettato--->";
	}
}
