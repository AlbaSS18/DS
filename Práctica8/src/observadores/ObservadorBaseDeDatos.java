package observadores;

import encuesta.Pregunta;

public class ObservadorBaseDeDatos implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aqu� se guardar�an los datos en disco/BD.");
	}

}
