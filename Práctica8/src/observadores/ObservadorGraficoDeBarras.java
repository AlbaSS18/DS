package observadores;

import encuesta.Pregunta;

public class ObservadorGraficoDeBarras implements Observador{
	
	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aqu� se dibujar�a el gr�fico de barras.");
	}

}
