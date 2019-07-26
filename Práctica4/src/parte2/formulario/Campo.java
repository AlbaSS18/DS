package parte2.formulario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import parte2.validaciones.Validacion;

public class Campo {
	
	private String nombre;
	private Validacion validacion;
	private String texto;

	public Campo(String nombre, Validacion validacion) {
		this.nombre = nombre;
		this.validacion = validacion;
	}

	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(nombre + ": ");
				texto = consola.readLine();
				valido = validacion.isValid(texto);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}
	public String getDato() {
		return texto;
	}
}
