package observadores;

import encuesta.Pregunta;

public class ObservadorGraficoCircular implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aqu� se dibujar�a el gr�fico circular.");
	}

}
