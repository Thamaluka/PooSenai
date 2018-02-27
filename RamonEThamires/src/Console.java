import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import Formas.TipoForma;

public class Console {

	private Scanner scanner;

	public Console() {
		this.scanner = new Scanner(System.in);
		System.out.println("=====  v1 ======");
		System.out.println("");
	}

	public TipoForma selecionaTipo() {
		System.out.println("Escolha qual a forma desejada ");
		System.out.println("");
		System.out.println("Escolha 1 para Retângulo");
		System.out.println("Escolha 2 para Triangulo");
		System.out.println("Escolha 3 para Circulo");
		System.out.println("Escolha 4 para Trapezio");

		String inputEscolha = scanner.nextLine();
		int escolha = Integer.valueOf(inputEscolha);

		switch (escolha) {
		case 1:
			return TipoForma.RETANGULO;
		case 2:
			return TipoForma.TRIANGULO;
		case 3:
			return TipoForma.CIRCULO;
		case 4:
			return TipoForma.TRAPEZIO;
		}
		return null;
	}

	public boolean confirmaSN(String confirmacao) {
		System.out.println(" Deseja realizar outro cálculo? (S/N) ");
		return scanner.nextLine().equalsIgnoreCase("s");
	}

	public void enviarMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public void close() {
		this.scanner.close();
		System.out.println("=== FIM ===");
	}

	public Map<String, Double> readParametros(String[] parametros) {
		System.out.println("Informe os valores para os parametros: ");
		Map<String, Double> aux = new LinkedHashMap<>(parametros.length);
		for (String parametro : parametros) {
			aux.put(parametro, this.readParametro(parametro));
		}
		return aux;
	}

	protected double readParametro(String parametro) {
		System.out.println(" - " + parametro + ": ");
		String input = scanner.nextLine();
		System.out.println("");
		return Double.valueOf(input);
	}

}
