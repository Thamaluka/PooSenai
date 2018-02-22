import Formas.Circulo;
import Formas.Forma;
import Formas.Retangulo;
import Formas.TipoForma;
import Formas.Triangulo;

public class Calculador {

	private Console console;

	public Calculador() {
		this.console = new Console();
	}

	public void close() {
		this.console.close();
	}

	public void init() {
		do {
			
			TipoForma tipo = this.console.selecionaTipo();
			Forma forma = null;

			switch (console.selecionaTipo()) {
			case RETANGULO:

				console.enviarMensagem(Messages.getString("Calculador.DigitaBase")); //$NON-NLS-1$
				String inputBase = console.lerLinha();
				console.enviarMensagem(Messages.getString("Calculador.DigitaAltura")); //$NON-NLS-1$
				String inputAltura = console.lerLinha();
				console.enviarMensagem(""); //$NON-NLS-1$

				Retangulo retangulo = new Retangulo(Float.valueOf(inputAltura), Float.valueOf(inputBase));

				System.out.println(Messages.getString("Calculador.DigitaArea") + retangulo.getArea()); //$NON-NLS-1$
				console.enviarMensagem(Messages.getString("Calculador.DigitaPerimetro") + retangulo.getPerimetro()); //$NON-NLS-1$
				console.enviarMensagem(""); //$NON-NLS-1$

				break;

			case TRIANGULO:
				console.enviarMensagem(" Digite a altura: "); //$NON-NLS-1$
				String inputAlturaTriangulo = console.lerLinha();
				console.enviarMensagem(" Digite a base: "); //$NON-NLS-1$
				String inputBaseTriangulo = console.lerLinha();

				console.enviarMensagem(Messages.getString("Calculador.DigiteLado")); //$NON-NLS-1$
				String inputLadoTriangulo = console.lerLinha();

				Triangulo triangulo = new Triangulo(Float.valueOf(inputAlturaTriangulo),
						Float.valueOf(inputBaseTriangulo), Float.valueOf(inputLadoTriangulo));

				console.enviarMensagem(""); //$NON-NLS-1$
				console.enviarMensagem(" area: " + triangulo.getArea()); //$NON-NLS-1$
				console.enviarMensagem(" Perimetro: " + triangulo.getPerimetro()); //$NON-NLS-1$
				console.enviarMensagem(""); //$NON-NLS-1$
				break;

			case CIRCULO:
				double pi = Math.PI;
				console.enviarMensagem(Messages.getString("Calculador.DigiteDiametro")); //$NON-NLS-1$
				String inputAreaCirculo = console.lerLinha();
				console.enviarMensagem(Messages.getString("Calculador.DigiteRaio")); //$NON-NLS-1$
				String inputRaio = console.lerLinha();
				String inputdiametroCirculo = console.lerLinha();

				Circulo circulo = new Circulo(Double.valueOf(inputRaio), Double.valueOf(inputAreaCirculo));

				console.enviarMensagem(""); //$NON-NLS-1$
				console.enviarMensagem(" Area: " + circulo.getArea()); //$NON-NLS-1$
				console.enviarMensagem(" Perimetro: " + circulo.getDiametro()); //$NON-NLS-1$
				console.enviarMensagem(""); //$NON-NLS-1$

				break;

			case TRAPEZIO:

				console.enviarMensagem(Messages.getString("Calculador.DigiteBaseSup")); //$NON-NLS-1$
				String inputBaseTrapezioSup = console.lerLinha();

				console.enviarMensagem(Messages.getString("Calculador.DigiteBaseInf")); //$NON-NLS-1$
				String inputBaseTrapezio = console.lerLinha();

				console.enviarMensagem(Messages.getString("Calculador.DigiteTamanhoLado")); //$NON-NLS-1$
				String inputLado = console.lerLinha();

				console.enviarMensagem(" Digite a altura: "); //$NON-NLS-1$
				String inputAlturaTrapezio = console.lerLinha();

				console.enviarMensagem(""); //$NON-NLS-1$

				float areaTrapezio = criarAreaTrapezio(Float.valueOf(inputBaseTrapezio),
						Float.valueOf(inputBaseTrapezioSup), Float.valueOf(inputAlturaTrapezio));

				float perimetroTrapezio = criarPerimetroTrapezio(Float.valueOf(inputBaseTrapezio),
						Float.valueOf(inputBaseTrapezioSup), Float.valueOf(inputLado));

				console.enviarMensagem(" Area: " + areaTrapezio); //$NON-NLS-1$
				console.enviarMensagem(" Perimetro: " + perimetroTrapezio); //$NON-NLS-1$
				console.enviarMensagem(""); //$NON-NLS-1$
				break;
			// e pra fazer o calculador
			}

		} while (console.confirmaSN(Messages.getString("Calculador.EnviarMensagem"))); //$NON-NLS-1$
		console.enviarMensagem(Messages.getString("Calculador.Fim")); //$NON-NLS-1$
		console.close();
	}

	public static float criarAreaTrapezio(float base, float baseSup, float altura) {
		float areaTrapezio = base + baseSup * altura * 2;
		return areaTrapezio;
	}

	public static float criarPerimetroTrapezio(float base, float baseSup, float lado) {
		float perimetroTrapezio = base + baseSup + (lado * 2);
		return perimetroTrapezio;
	}
}