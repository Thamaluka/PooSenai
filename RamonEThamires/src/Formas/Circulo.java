package Formas;

public class Circulo extends Forma implements GeometriaPlana {
	
	double raio;
	double diametro;
	double pi = Math.PI;

	public Circulo(double raio, double diametro) {
		super(TipoForma.CIRCULO);
		this.raio = raio;
		this.diametro = diametro;
	}

	public double getRaio() {
		return raio;
	}

	public double getDiametro() {
		return diametro;
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
	

}
