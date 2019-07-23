package observers;

import encuesta.*;

public class GraficoDeBarras implements VoteObserver {

	@Override
	public void votoRecibido(Pregunta encuesta) {
		System.out.println("Dibujando grafico de barras");
	}

}
