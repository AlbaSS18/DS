package figuras.triangulo;

import java.awt.Point;

import editor.Editor;
import editor.Herramienta;

// Esta clase tiene que implementar de Herramienta porque mover,pinchar y soltar no son igual
public class CreadorTriangulo implements Herramienta{

	private Editor editor;
	private int vertices = 0;
	private Point[] vertice = new Point[3];
	
	public CreadorTriangulo(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void pinchar(int x, int y) {
		vertice[vertices++] = new Point(x,y);
		if (vertices == 3) {
			editor.getDibujo().addFigura(new FiguraTriangulo(vertice[0], vertice[1], vertice[2]));
			vertices = 0;
			editor.finHerramienta();
		}
	}

	@Override
	public void mover(int x, int y) {
		
	}

	@Override
	public void soltar(int x, int y) {
		
	}

	

}
