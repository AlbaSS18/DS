package figuras.circulo;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.herramientas.HerramientaCreacion;

public class CreadorCirculo extends HerramientaCreacion{

	public CreadorCirculo(Editor editor) {
		super(editor);
	}

	@Override
	public Figura metodoDeFabricacion(Point x, Point y) {
		Point centro = new Point((inicio.x + fin.x) / 2, (inicio.y + fin.y) / 2);
		int radio = Math.max(fin.x - inicio.x, fin.y - inicio.y) / 2;
		return new FiguraCirculo(centro, radio);
	}

}
