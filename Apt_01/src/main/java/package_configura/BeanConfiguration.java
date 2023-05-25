package package_configura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import esempio.application.context.Calcoli;

@Configuration
public class BeanConfiguration {
	@Bean(name="somma")
	public Calcoli getSomma() {
		return new Calcoli(0, 0, 0);
	}
	
	@Bean(name="moltiplicazione")
	public Calcoli getMoltiplica() {
		return new Calcoli(0, 0, 0);
	}
}
