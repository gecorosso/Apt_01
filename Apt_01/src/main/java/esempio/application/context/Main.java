package esempio.application.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import esempio.application.context.autowire.OrdineService;

public class Main {

	public static void main(String[] args) {
		//new Main();
		new Main().beanTestZerouno();
		//new Main().beanTestXml();
		//new Main().beanAutowired();		
		//new Main().beanConSingleton();
		//new Main().PropertyTest();
		//new Main().testAnnotation();
		//testDi() testAnnotationDue();
		//new Main().testDi(); 
		//new Main().dependsOn();
		//new Main().newTestAutowire();
		//new Main().newAutowireWhitoutXml();
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
	
	public void PropertyTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("metaXml_Property.xml");
		BeanProperty property = context.getBean("myProperty",BeanProperty.class);
		property.Saluti();
		
		
	}
	
	public void testAnnotation() {
		ApplicationContext context = new ClassPathXmlApplicationContext("metaXml_Annotation.xml");
		BeanAnnotation bean_notazione = context.getBean("my_bean_annotation", BeanAnnotation.class);
		bean_notazione.Saluti();
	}
	
	public void testAnnotationDue() {
		ApplicationContext context = new ClassPathXmlApplicationContext("metaXml_Annotation.xml");
		esempio.application.context.autowire.OrdineService os = context.getBean("ordine",esempio.application.context.autowire.OrdineService.class);
		System.out.println(os.getOrdineInfo());
		
		Class<?> type = context.getType("prodotto");
		
		System.out.println(type.getName());
		
	}
	
	public void testDi() {
		ApplicationContext context = new ClassPathXmlApplicationContext("DI_Iniection_Metadati.xml");
		D_Iniection.FatturaService fs = context.getBean("fattura", D_Iniection.FatturaService.class);
		D_Iniection.DoubleService doub = context.getBean("doub",D_Iniection.DoubleService.class);
		
		System.out.println(fs.StampaFattura());
		System.out.println(doub.StampaDouble());
	}
	
	public void dependsOn() {
	 ApplicationContext context = new ClassPathXmlApplicationContext("dependsOn.xml");	
	 D_Iniection.BeanA my_bean_a = context.getBean("bean_a", D_Iniection.BeanA.class);
	 my_bean_a.meSsaggio();
	}

	public void newTestAutowire() {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_iniection.xml");
		
		D_Iniection.BeanAutoB bb = context.getBean("bean_di_B",D_Iniection.BeanAutoB.class);
		
		D_Iniection.BeanAutoD dd = context.getBean("bean_di_D",D_Iniection.BeanAutoD.class);
		D_Iniection.BeanAutoE ee = context.getBean("bean_di_E",D_Iniection.BeanAutoE.class);	
		
		
		bb.Saluti();
		dd.Saluti();
		ee.Saluti();
		
	}
	
	public void newAutowireWhitoutXml() {
		//autowire_NO_Conf_XML.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire_NO_Conf_XML.xml");
		
		esempio.application.context.autowire.Auto myAuto=context.getBean("auto", esempio.application.context.autowire.Auto.class);
		
		System.out.println(myAuto.scriViMessaggio());
		
		
	}
	
}
