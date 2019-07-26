package adaptadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Restaurante;

public class AdaptadorRestaurante extends Restaurante implements Marcador{

	private Navegador navegador = new Navegador();
	
	public AdaptadorRestaurante(String nombre, String direcci�n, String tel�fono) {
		super(nombre, direcci�n, tel�fono);
	}

	@Override
	public Coordenadas getCoordenadas() {
		return navegador.getCoordenadas(this.getDirecci�n());
	}

	@Override
	public String getTooltipInfo() {
		return this.getNombre() + this.getTel�fono();
	}

	@Override
	public void abrir() {
		this.llamar();
	}

}
