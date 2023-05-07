package D_Iniection;

public class FatturaService {
	private OrdineService os;
	private ProdottoService ps;
		
	public FatturaService(OrdineService os, ProdottoService ps) {
		super();
		this.os = os;
		this.ps = ps;
	}

	public String StampaFattura() {
		 return os.myMessaggio("Sono Ordine Service")+"		"+ps.myMessaggio("Sono Prodotto Service");
	}
}
