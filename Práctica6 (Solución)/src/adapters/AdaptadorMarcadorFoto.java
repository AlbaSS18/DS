package adapters;

import google.maps.*;
import model.*;

public class AdaptadorMarcadorFoto implements Marcador {

	private Foto foto;

	public AdaptadorMarcadorFoto(Foto photo) {
		this.foto = photo;
	}

	@Override
	public Coordenadas getCoordenadas() {
		return foto.getCoordenadas();
	}

	@Override
	public String getTooltipInfo() {
		return foto.getDescripción() + ". Foto subida por " + foto.getUsuario();
	}

	@Override
	public void abrir() {
		foto.descargar();
	}

}
