package esempio.application.context;

public class Calcoli {
	private int a;
	private int b;
	private int c;
	
	
	public Calcoli(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int sommaToria(int x, int y) {
		return x+y;
	}
	
	public int moltiPlicazione(int x, int y) {
		return x*y;
	}
}
