package esempio.application.context.autowire;

import org.springframework.stereotype.Component;

@Component(value="cliente")
public class ClienteService {

	public String getClienteInfo() {
		return "Gennaro Codamozza";
	}
	
	
	
}
