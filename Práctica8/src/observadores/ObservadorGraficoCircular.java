package observadores;

import encuesta.Pregunta;

public class ObservadorGraficoCircular implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aquí se dibujaría el gráfico circular.");
	}

}
