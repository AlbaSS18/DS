package adapters;

import google.maps.*;
import model.*;


public class AdaptadorMarcadorRestaurante implements Marcador {

	private Restaurante restaurante;
	private Navegador navegador = new Navegador();

	public AdaptadorMarcadorRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public Coordenadas getCoordenadas() {
		return navegador.getCoordenadas(restaurante.getDirecci�n());
	}

	@Override
	public String getTooltipInfo() {
		return "Restaurante '" + restaurante.getNombre() + "'. Tfn: " + restaurante.getTel�fono();
	}

	@Override
	public void abrir() {
		restaurante.llamar();
	}

}
