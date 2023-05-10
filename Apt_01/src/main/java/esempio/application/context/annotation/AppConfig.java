package esempio.application.context.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="userBean")
	public User getUser() {
		return new User(new Phone());
	}
	
	@Bean(name="nazionalita")
	public Nazione getNazionalita() {
		return new Nazione();
	}
	
	@Bean(name="reparto")
	 //private String nomeReparto;
     //private String piano;
	
	public Reparto getReparto() {
	   return new Reparto();
	} 
	
	
	
	
	
	
	
}
