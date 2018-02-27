package Formas;

import java.util.Map;

public class Circulo extends Forma implements GeometriaPlana {
	
	private enum Parametros {RAIO};
	
	double raio;
	double pi = Math.PI;

	public Circulo(double raio, double diametro) {
		super(TipoForma.CIRCULO);
		this.raio = raio;
	}

	public Circulo () {
		super(TipoForma.CIRCULO);
	}
	
	public Circulo(double raio) {
		this(); 
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public double getArea() {
		return pi * raio * 2;
	}

	public double getPerimetro() {
		return 2 * pi * raio;
	}

	@Override
	public void exibirCalculo() {
		System.out.println(" Area do Circulo: " + this.getArea());
		System.out.println(" Perimetro do Circulo: " + this.getPerimetro());
	}

	@Override
	public String[] getParametros() {
		String[] parametros = { Parametros.RAIO.name() };
		return null;
	}

	@Override
	public void setParametros(Map<String, Double> args) {
		this.raio = args.get(Parametros.RAIO.name());
		
	}
	

}
