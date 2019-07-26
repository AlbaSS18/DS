package adaptadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import google.maps.Navegador;
import model.Monumento;

public class AdaptadorMonumento extends Monumento implements Marcador {

	private Navegador navegador = new Navegador();
	
	public AdaptadorMonumento(String nombre, String autor, String direcci�n) {
		super(nombre, autor, direcci�n);
	}

	@Override
	public Coordenadas getCoordenadas() {
		return navegador.getCoordenadas(this.getDirecci�n());
	}

	@Override
	public String getTooltipInfo() {
		return this.getNombre() + this.getAutor();
	}

	@Override
	public void abrir() {
		navegador.navegarHasta(this.getDirecci�n());
	}

}
