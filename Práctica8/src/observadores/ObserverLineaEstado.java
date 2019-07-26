package observadores;

import encuesta.Pregunta;

public class ObserverLineaEstado implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aquí se dibujaría línea de estado. Nº de votos SI = " +  pregunta.getVotosSi() + " nº de votos NO = " + pregunta.getVotosNo());
	}

}
