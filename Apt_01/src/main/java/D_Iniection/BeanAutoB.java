package D_Iniection;

public class BeanAutoB {
	BeanAutoA bean_di_A;
	BeanAutoC bean_di_C;
	
	public void Saluti() {
		System.out.println("Sono Bean di Auto B --> " + bean_di_A.Saluti()+"-->" + bean_di_C.Saluti());
	}

	public void setBean_di_A(BeanAutoA bean_di_A) {
		this.bean_di_A = bean_di_A;
	}

	public void setBean_di_C(BeanAutoC bean_di_C) {
		this.bean_di_C = bean_di_C;
	}
	
}
