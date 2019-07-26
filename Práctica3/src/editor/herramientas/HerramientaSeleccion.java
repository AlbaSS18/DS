package editor.herramientas;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.Herramienta;

public class HerramientaSeleccion implements Herramienta{

	protected Editor editor;
	private Point posicion;
	private Figura seleccionada;
	
	public HerramientaSeleccion(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void pinchar(int x, int y) {
		seleccionada = editor.getDibujo().getFigura(x, y);
		posicion = new Point(x, y);
	}

	@Override
	public void mover(int x, int y) {
		mueveIncremento(x,y);
	}

	@Override
	public void soltar(int x, int y) {
		mueveIncremento(x, y);
	}
	
	private void mueveIncremento(int x, int y) {
		if (seleccionada != null) {
			seleccionada.mover(x - posicion.x, y - posicion.y);
			posicion = new Point(x, y);
		}
	}

}
