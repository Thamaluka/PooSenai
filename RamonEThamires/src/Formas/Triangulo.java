package Formas;

import java.util.Map;

public class Triangulo  extends Forma implements GeometriaPlana {
	
	private enum Parametros {BASE,ALTURA,LADO}
	
	double altura;
	double base;
	double lado;
	
	//construtor
	
	public Triangulo(double altura, double base, double lado) {
		super(TipoForma.TRIANGULO);
		this.altura = altura;
		this.base = base;
		this.lado = lado;
	}
	
	public Triangulo(){
		super(TipoForma.TRIANGULO);
	}

	public double getAltura() {
		return altura;
	}

	public double getBase() {
		return base;
	}

	public double getLado() {
		return lado;
	}
	
	public double getArea() {
		return altura * base;
	}
	
	public double getPerimetro() {
		return lado * 3;
	}
	
	@Override
	public void exibirCalculo() {
		System.out.println(" Area do Circulo: " + this.getArea());
		System.out.println(" Perimetro do Circulo: " + this.getPerimetro());
	}

	@Override
	public String[] getParametros() {
		String [] parametros = {Parametros.ALTURA.name(), Parametros.BASE.name(), Parametros.LADO.name()};
		return null;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.altura = args.get(Parametros.ALTURA.name());
		this.lado = args.get(Parametros.LADO.name());
		this.base = args.get(Parametros.BASE.name());
		
	}
	
}
