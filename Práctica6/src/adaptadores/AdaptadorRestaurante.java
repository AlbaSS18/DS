package adaptadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class AdaptadorRestaurante extends Restaurante implements Marcador{

	private Navegador navegador = new Navegador();
	
	public AdaptadorRestaurante(String nombre, String dirección, String teléfono) {
		super(nombre, dirección, teléfono);
	}

	@Override
	public Coordenadas getCoordenadas() {
		return navegador.getCoordenadas(this.getDirección());
	}

	@Override
	public String getTooltipInfo() {
		return this.getNombre() + this.getTeléfono();
	}

	@Override
	public void abrir() {
		this.llamar();
	}

}
