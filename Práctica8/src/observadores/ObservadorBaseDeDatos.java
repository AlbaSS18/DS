package observadores;

import encuesta.Pregunta;

public class ObservadorBaseDeDatos implements Observador{

	@Override
	public void actualizar(Pregunta pregunta) {
		System.out.println("Aquí se guardarían los datos en disco/BD.");
	}

}
