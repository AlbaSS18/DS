package observers;

import encuesta.*;

public class LineaDeEstado implements VoteObserver {

	@Override
	public void votoRecibido(Pregunta encuesta) {
		System.out.println("Si = " + encuesta.getVotosSi() + "/ No = " + encuesta.getVotosNo());
	}

}
