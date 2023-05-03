package esempio.application.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name="saluta")
	
	public Saluti getSaluti() {
		return new Saluti();
	}
	
	
}
