package observadores;

import encuesta.Pregunta;

public class ObservadorRepetidor implements Observador{

	private int frecuencia;
	private int contador;
	private Observador observador;

	public ObservadorRepetidor(Observador observador,int frecuencia) {
		this.frecuencia = frecuencia;
		this.observador = observador;
		this.contador = frecuencia;
	}

	@Override
	public void actualizar(Pregunta pregunta) {
		if (contador == frecuencia) {
			observador.actualizar(pregunta);
			contador = 1;
		} else
			contador++;
	}

}
