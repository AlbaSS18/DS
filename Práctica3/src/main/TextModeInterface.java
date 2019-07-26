package main;

import java.io.*;

import editor.*;
import figuras.circulo.CreadorCirculo;
import figuras.cuadrado.CreadorCuadrado;
import figuras.triangulo.CreadorTriangulo;

public class TextModeInterface {

	public TextModeInterface(Editor editor) {
		this.editor = editor;
		this.in = new BufferedReader(new InputStreamReader(System.in));

		creaHerramientas();
	}

	private void creaHerramientas() {
		circulo = new CreadorCirculo(editor);
		cuadrado = new CreadorCuadrado(editor);
		triangulo = new CreadorTriangulo(editor);
	}

	public void run() throws IOException {
		System.out.println("Comandos Herramientas: cuadrado, circulo, triangulo, seleccion");
		System.out.println("Comandos Ratón: pinchar x,y / mover x,y / soltar x,y");
		System.out.println("Otros Comandos: dibujar, exit");
		do {
			System.out.print(">");
			String[] line = in.readLine().split("[ ,]");
			if (line[0].equals("exit"))
				return;
			if (line[0].equals("cuadrado"))
				editor.setHerramienta(cuadrado);
			else if (line[0].equals("circulo"))
				editor.setHerramienta(circulo);
			else if (line[0].equals("triangulo"))
				editor.setHerramienta(triangulo);
			else if (line[0].equals("seleccion"))
				editor.setHerramienta(editor.getHerramienta());
			else if (line[0].equals("pinchar"))
				editor.pinchar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("mover"))
				editor.mover(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("soltar"))
				editor.soltar(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("dibujar"))
				editor.dibujar();
			else
				System.out.println("Comando no válido");

		} while (true);
	}

	private Editor editor;
	private BufferedReader in;

	private Herramienta circulo, cuadrado, triangulo;
}
