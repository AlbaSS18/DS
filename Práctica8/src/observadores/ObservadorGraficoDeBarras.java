package observadores;

import encuesta.Pregunta;

public class ObservadorGraficoDeBarras implements Observador{
	
	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aquí se dibujaría el gráfico de barras.");
	}

}
