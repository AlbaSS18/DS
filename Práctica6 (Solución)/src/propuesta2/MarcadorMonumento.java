package propuesta2;

import google.maps.*;
import model.*;


public class MarcadorMonumento extends Monumento implements Marcador {

	public MarcadorMonumento(String name, String author, String address) {
		super(name, author, address);
	}

	// ----------------------------------------------------
	// Sólo habría que añadir los métodos de Marcador -----

	public Coordenadas getCoordenadas() {
		return null; /* Hacerlo */
	}

	public String getTooltipInfo() {
		return null; /* Hacerlo */
	}

	public void abrir() {
		/* Hacerlo */
	}
}

//------------------------------------------------------------------
// El main no iría aquí (se incluye solo para poder mostrarlo junto)
class Main {
	public static void main(String[] args) {
		MarcadorMonumento coliseo = new MarcadorMonumento("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma");

		Mapa map = new Mapa();
		map.add(coliseo); // Ahora sí se puede!!!
	}
}
