package Formas;

public class Trapezio implements GeometriaPlana {

	double base;
	double baseSup;
	double lado;
	double area;
	double perimetro;

	// Construtor
	public Trapezio(double base, double baseSup, double lado) {
		super();
		this.base = base;
		this.baseSup = baseSup;
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public double getBaseSup() {
		return baseSup;
	}

	public double getLado() {
		return lado;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	@Override
	public void exibirCalculo() {
		System.out.println(" Area do Trapézio: " + this.getArea());
		System.out.println(" Perimetro do Trapézio: " + this.getPerimetro());
	}

}
