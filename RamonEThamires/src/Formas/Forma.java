package Formas;

import java.util.Map;

public abstract class Forma {
	private TipoForma tipo;
	
	public Forma(TipoForma tipo){
		this.tipo = tipo;
	}

	public TipoForma getTipo() {
		return tipo;
	}
	
	public abstract String[] getParametros();
	public abstract void setParametros(Map<String, Double> args);
}
