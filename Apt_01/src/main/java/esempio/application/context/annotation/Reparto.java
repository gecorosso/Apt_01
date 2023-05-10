package esempio.application.context.annotation;

import org.springframework.stereotype.Component;

@Component(value="reparto")
public class Reparto {
    private String nomeReparto;
    private String piano;
	
	public String getNomeReparto() {
		return nomeReparto;
	}

	public String getPiano() {
		return piano;
	}

	public void setNomeReparto(String nomeReparto) {
		this.nomeReparto = nomeReparto;
	}

	public void setPiano(String piano) {
		this.piano = piano;
	}
    
}
