package adaptadores;

import google.maps.Coordenadas;
import google.maps.Marcador;
import model.Foto;

public class AdaptadorFoto extends Foto implements Marcador{

	public AdaptadorFoto(String usuario, String descripci�n, Coordenadas coordenadas) {
		super(usuario, descripci�n, coordenadas);
	}

	@Override
	public String getTooltipInfo() {
		return this.getDescripci�n() + this.getUsuario();
	}

	@Override
	public void abrir() {
		this.descargar();
	}

}
