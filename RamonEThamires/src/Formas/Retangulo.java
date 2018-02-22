package Formas;

public class Retangulo implements GeometriaPlana {
	
	double altura;
	double base;
	
	public Retangulo (double altura, double base){
		super();
		this.altura = altura;
		this.base = base;
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
		System.out.println(" Area do Circulo: " + this.getArea());
		System.out.println(" Perimetro do Circulo: " + this.getPerimetro());	
	}
	
	
	
	
}
