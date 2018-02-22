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
		// TODO: implementar
	}

	public void close() {
		this.scanner.close();

	}

	public String lerLinha() {
		return scanner.nextLine();

	}
}
