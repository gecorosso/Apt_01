package esempio.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//new Main();
		//new Main().beanTestZerouno();
		//new Main().beanTestXml();
		//new Main().beanAutowired();
		
		new Main().beanConSingleton();
	}
	
	public Main() {
//		ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
//		Saluti salve = app.getBean("saluta",Saluti.class);
//		System.out.println(salve.getSaluti());
	}
	
	public void beanTestZerouno() {
		ApplicationContext app = new AnnotationConfigApplicationContext(package_configura.BeanConfiguration.class);
		Calcoli calc = app.getBean("somma",Calcoli.class);
		
		System.out.println(calc.sommaToria(10, 50));
		System.out.println(calc.moltiPlicazione(2, 11));
	}
	
	public void beanTestXml() {
		ApplicationContext appXml = new ClassPathXmlApplicationContext("metaXml.xml");
		Libro book = appXml.getBean("libro",Libro.class);
		System.out.println(book.getTitolo());
		System.out.println(book.getCapitolo());
		System.out.println(book.getPagina());
	}
	
	public void beanAutowired() {
		ApplicationContext app = new ClassPathXmlApplicationContext("metaXml_Autowire.xml");
		
		//--Esempio di Autoware con il setter
		AutoB b = app.getBean("auto_b",AutoB.class);
		//--Correzione che si differenzia dall esempio del corso se non faccio
		//--così ritorna null ....
		b.setAuto_A(new AutoA());
		b.setAuto_C(new AutoC());
		System.out.println(b.Saluto());
		//---Testato Autowire con il costruttore ...
		AutoE auto_e = app.getBean("auto_e",AutoE.class);
		System.out.println(auto_e.saLuto());
	}
	
	public void  beanConSingleton() {
		ApplicationContext context = new ClassPathXmlApplicationContext("metaXml_Scope.xml");
		
		//Genera in singleton
		BeanSingleton beanSingolo = context.getBean("bean_singleton",BeanSingleton.class);
		beanSingolo.setMessaggio("ASSORETA");
		//lo scrive
		System.out.println(beanSingolo.Saluti());
		
		//Rigenera il bean 
		BeanSingleton beanSingolo_01 = context.getBean("bean_singleton",BeanSingleton.class);
		//Non gli assegnamo nulla...
		//beanSingolo.setMessaggio("ASSORETA");
		//Riscrive 
		System.out.println(beanSingolo_01.Saluti());
		//Permane lo stesso messaggio... pur essendo una nuova istanza
		//proprio perchè il container fà una istanza del Bean e lo salva nella cache
		//e lo dimostra in seconda System.out.
		
		/*
			Funzionamento del Prototype
		*/
		
	     BeanPrototype beanProto = context.getBean("bean_protoType",BeanPrototype.class);
	     //Lo scrive
	     beanProto.setMessaggio("Messaggio di Prototype");
	     //lo legge
	     System.out.println(beanProto.Saluto()+"<-");
	     
	     //generiamo una nuova istanza con Prototype!!!!
	     BeanPrototype beanProto_01 = context.getBean("bean_protoType",BeanPrototype.class);
	     //lo Scrive
	     //beanProto_01.setMessaggio("Ciao Sono PrototypeXX");
	     //lo legge
	     System.out.println(beanProto_01.Saluto());	     
		
	}
	

}
