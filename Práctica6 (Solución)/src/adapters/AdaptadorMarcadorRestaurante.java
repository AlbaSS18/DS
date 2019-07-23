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
		return navegador.getCoordenadas(restaurante.getDirección());
	}

	@Override
	public String getTooltipInfo() {
		return "Restaurante '" + restaurante.getNombre() + "'. Tfn: " + restaurante.getTeléfono();
	}

	@Override
	public void abrir() {
		restaurante.llamar();
	}

}
