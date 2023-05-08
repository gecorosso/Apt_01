package esempio.application.context.autowire;
import org.springframework.stereotype.Component;

@Component(value="ruota")
public class Ruota {
	public String getMyRuota(){
		return "Ciao sono una ruota rossa detta ruotino";
	}

}
