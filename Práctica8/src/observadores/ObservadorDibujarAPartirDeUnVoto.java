package observadores;

import encuesta.Pregunta;

public class ObservadorDibujarAPartirDeUnVoto implements Observador{

	private int numeroPregunta;
	private Observador observer;
	
	public ObservadorDibujarAPartirDeUnVoto(Observador observer, int numeroPregunta) {
		this.numeroPregunta = numeroPregunta;
		this.observer = observer;
	}
	
	
	@Override
	public void actualizar(Pregunta pregunta) {
		if (pregunta.getVotosSi() + pregunta.getVotosNo() >= numeroPregunta) {
			observer.actualizar(pregunta);
		}
	}

}
