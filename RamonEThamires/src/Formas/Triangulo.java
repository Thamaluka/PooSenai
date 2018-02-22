package Formas;

public class Triangulo implements GeometriaPlana {

	double altura;
	double base;
	double lado;
	
	//construtor
	
	public Triangulo(double altura, double base, double lado) {
		super();
		this.altura = altura;
		this.base = base;
		this.lado = lado;
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
	
}
