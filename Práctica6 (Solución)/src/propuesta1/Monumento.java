package propuesta1;

import google.maps.*;

public class Monumento implements Marcador {
	// ----------------------------------------------
	// Est� c�digo ser�a el mismo... ----------------
	private String nombre;
	private String autor;
	private String direcci�n;

	public Monumento(String nombre, String author, String address) {
		this.nombre = nombre;
		this.autor = author;
		this.direcci�n = address;
	}

	public String getNombre() { return nombre; }

	public String getAutor() { return autor; }

	public String getDirecci�n() { return direcci�n; }
	
	// ----------------------------------------------------
	// ... y habr�a que a�adir los m�todos de Marcador ----
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
