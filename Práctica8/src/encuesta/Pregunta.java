package encuesta;

import java.util.ArrayList;
import java.util.List;

import observadores.Observador;

public class Pregunta {

	private int si, no;
	private String pregunta;
	private List<Observador> observadores = new ArrayList<>();

	public Pregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		notificar();
	}

	public void incrementaNo() {
		no++;
		notificar();
	}
	
	private void notificar() {
		for(Observador o: observadores) {
			o.actualizar(this);
		}
	}
	
	public void adscribir(Observador observador) {
		observadores.add(observador);
	}
	
	public void quitar (Observador observador) {
		observadores.remove(observador);
	}

}
