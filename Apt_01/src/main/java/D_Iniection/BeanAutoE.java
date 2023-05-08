package D_Iniection;

public class BeanAutoE {
	private BeanAutoC bean_di_C;
	
	public void Saluti() {
		System.out.println("Sono BeanAuto E !!! con costruttore -->"+bean_di_C.Saluti());
	}

	public BeanAutoE(BeanAutoC bean_di_C) {
		super();
		this.bean_di_C = bean_di_C;
	}
	
	
	

}
