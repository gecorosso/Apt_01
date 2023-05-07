package esempio.application.context.autowire;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="ordine")
public class OrdineService {
	private ClienteService cliente;
	
	@Autowired
	public OrdineService(ClienteService cliente) {
		super();
		this.cliente = cliente;
	}

	public String getOrdineInfo() {
		 String data = new Date().toString();
		 String infoCliente = cliente.getClienteInfo();
		 
		 return data + " " +infoCliente;
	}
	
}
