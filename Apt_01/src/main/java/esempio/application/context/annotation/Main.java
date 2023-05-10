package esempio.application.context.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		conFig();
		//conFigConScan();

	}
	
	private static void conFig() {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean("userBean", User.class);
		Nazione nazione = context.getBean("nazionalita", Nazione.class);
		
		Reparto reparto = context.getBean("reparto", Reparto.class);
		
		reparto.setNomeReparto("Ginecologia");
		reparto.setPiano("1");
		
		
		
		
		System.out.println(user.getUserInfo()+"--"+user.getTelefono());
		
		
		System.out.println(nazione.getNazionalita());
		System.out.println(reparto.getNomeReparto()+"--"+reparto.getPiano());
		
	}
	
	private static void conFigConScan() {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScan.class);
		esempio.application.context.annotation.scan.Role role=context.getBean("role",esempio.application.context.annotation.scan.Role.class);
		
		System.out.println(role.getRole());
	}
	

}
