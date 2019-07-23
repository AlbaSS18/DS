package propuesta1;

import google.maps.*;

public class Monumento implements Marcador {
	// ----------------------------------------------
	// Esté código sería el mismo... ----------------
	private String nombre;
	private String autor;
	private String dirección;

	public Monumento(String nombre, String author, String address) {
		this.nombre = nombre;
		this.autor = author;
		this.dirección = address;
	}

	public String getNombre() { return nombre; }

	public String getAutor() { return autor; }

	public String getDirección() { return dirección; }
	
	// ----------------------------------------------------
	// ... y habría que añadir los métodos de Marcador ----
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
