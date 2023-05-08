package D_Iniection;

public class BeanAutoD {
	BeanAutoA bean_di_A;
	
	
	public void Saluti() {
		System.out.println("Sono Bean Auto D -->"+bean_di_A.Saluti());
	}


	public void setBean_di_D(BeanAutoA bean_di_A) {
		this.bean_di_A = bean_di_A;
	}
	
	
	
	
}
