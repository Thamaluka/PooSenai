import java.util.Map;

import Formas.Circulo;
import Formas.Forma;
import Formas.GeometriaPlana;
import Formas.Retangulo;
import Formas.TipoForma;
import Formas.Trapezio;
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

			switch (tipo) {
			case RETANGULO:
				forma = new Retangulo();
				break;

			case TRIANGULO:
				forma = new Triangulo();
				break;

			case CIRCULO:
				forma = new Circulo();
				console.enviarMensagem(Messages.getString("Calculador.DigiteDiametro")); //$NON-NLS-1$
				break;

			case TRAPEZIO:
				forma = new Trapezio();
				console.enviarMensagem(""); //$NON-NLS-1$
				break;

			}
			Map<String, Double> parametros = this.console.readParametros(forma.getParametros());
			forma.setParametros(parametros);

			if (forma != null) {
				((GeometriaPlana) forma).exibirCalculo();
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