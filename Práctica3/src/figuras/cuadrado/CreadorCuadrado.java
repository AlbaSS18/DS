package figuras.cuadrado;

import java.awt.Point;

import editor.Editor;
import editor.Figura;
import editor.herramientas.HerramientaCreacion;

public class CreadorCuadrado extends HerramientaCreacion{

	public CreadorCuadrado(Editor editor) {
		super(editor);
	}

	@Override
	public Figura metodoDeFabricacion(Point x, Point y) {
		return new FiguraCuadrado(x,y);
	}

}
