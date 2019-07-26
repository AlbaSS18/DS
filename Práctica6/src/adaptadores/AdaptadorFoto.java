package adaptadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import model.Foto;

public class AdaptadorFoto extends Foto implements Marcador{

	public AdaptadorFoto(String usuario, String descripción, Coordenadas coordenadas) {
		super(usuario, descripción, coordenadas);
	}

	@Override
	public String getTooltipInfo() {
		return this.getDescripción() + this.getUsuario();
	}

	@Override
	public void abrir() {
		this.descargar();
	}

}
