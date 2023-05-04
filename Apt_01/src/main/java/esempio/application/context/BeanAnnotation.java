package esempio.application.context;

import org.springframework.stereotype.Component;

@Component(value="my_bean_annotation")
public class BeanAnnotation {
	
	public void Saluti() {
		System.out.println("Salutame Assoreta con Annotazione");
	}

}
