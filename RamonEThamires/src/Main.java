import java.util.Scanner;

import Formas.Circulo;
import Formas.Retangulo;
import Formas.Triangulo;

public class Main {

	public static void main(String[] args) {
		Calculador calc = new Calculador();
		calc.init();
	}
	
	public static double criarDiametroCirculo(double raio, double pi) {
		double areaCirculo = pi * (Double.valueOf(raio) * 2);
		return areaCirculo;
	}

	public static double criarPerimetroCirculo(double raio, double pi) {
		double perimetroCirculo = (2 * (Double.valueOf(raio) * pi));
		return perimetroCirculo;
	}
	
}
