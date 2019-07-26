package observadores;

import encuesta.Pregunta;

public class ObserverLineaEstado implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aqu� se dibujar�a l�nea de estado. N� de votos SI = " +  pregunta.getVotosSi() + " n� de votos NO = " + pregunta.getVotosNo());
	}

}
