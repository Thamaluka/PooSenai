package Formas;

import java.util.Map;

public class Retangulo extends Forma  implements GeometriaPlana {
	
	private enum Parametros {BASE,ALTURA};
	
	double altura;
	double base;
	
	public Retangulo (double altura, double base){
		super(TipoForma.RETANGULO);
		this.altura = altura;
		this.base = base;
	}
	
	public Retangulo () {
		super(TipoForma.RETANGULO);
	}
	
	public Retangulo(double altura) {
		this();
		this.altura = altura;
		
	}
	
	public double getAltura() {
		return altura;
	}

	public double getBase() {
		return base;
	}
	
	public double getArea() {
		return base * altura;
	}
	
	public double getPerimetro() {
		return 2 * (base + altura);
	}

	@Override
	public void exibirCalculo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getParametros() {
	String [] parametros = { Parametros.ALTURA.name() , Parametros.BASE.name()};
		return null;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.altura = args.get(Parametros.ALTURA.name());
		this.base = args.get(Parametros.BASE.name());
	}

	
}
