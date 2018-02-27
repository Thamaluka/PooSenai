package Formas;

import java.util.Map;


public class Trapezio extends Forma implements GeometriaPlana {

	private enum Parametros {BASE,BASESUP,LADO,AREA,PERIMETRO};
	
	double base;
	double baseSup;
	double lado;
	double area;
	double perimetro;

	// Construtor
	public Trapezio(double base, double baseSup, double lado) {
		super(TipoForma.TRAPEZIO);
		this.base = base;
		this.baseSup = baseSup;
		this.lado = lado;
	}

	public Trapezio () {
		super(TipoForma.TRAPEZIO);
	}
	
	public Trapezio (double base) {
		this();
		this.base = base;
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
	

	@Override
	public String[] getParametros() {
		String [] parametros = { Parametros.BASE.name() , Parametros.BASESUP.name(), Parametros.PERIMETRO.name() , 
				Parametros.LADO.name() , Parametros.AREA.name() };
		return null;
	}
	
	@Override
	public void setParametros(Map<String, Double> args) {
		this.base = args.get(Parametros.BASE.name());
		this.baseSup = args.get(Parametros.BASESUP.name());
		this.lado = args.get(Parametros.LADO.name());
		this.area = args.get(Parametros.AREA.name());
		this.perimetro = args.get(Parametros.PERIMETRO.name());
	}

}
