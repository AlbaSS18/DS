package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.Herramienta;

public abstract class HerramientaCreacion implements Herramienta {
	
	private Editor editor;
	protected Point inicio,fin;
	
	public HerramientaCreacion(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void pinchar(int x, int y) {
		inicio = new Point(x, y);
	}

	@Override
	public void mover(int x, int y) {
	}

	@Override
	public void soltar(int x, int y) {
		fin = new Point(x, y);
		Figura figura = metodoDeFabricacion(inicio,fin);
		editor.getDibujo().addFigura(figura);
		editor.finHerramienta();
	}

	public abstract Figura metodoDeFabricacion(Point x, Point y);

}
