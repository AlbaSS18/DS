package figuras.triangulo;

import java.awt.Point;

import editor.Figura;

public class FiguraTriangulo implements Figura{

	private Point esquina1, esquina2, esquina3;
	
	public FiguraTriangulo(Point esquina1, Point esquina2, Point esquina3) {
		this.esquina1 = esquina1;
		this.esquina2 = esquina2;
		this.esquina3 = esquina3;
	}

	@Override
	public void dibujar() {
		System.out.println("Triangulo: v1 = " + this.esquina1 + ", v2 = " + this.esquina2 + ", v3 = "+ this.esquina3);
	}

	@Override
	public void mover(int dx, int dy) {
		esquina1.translate(dx, dy);
		esquina2.translate(dx, dy);
		esquina3.translate(dx, dy);
	}

	@Override
	public boolean contiene(int x, int y) {
		Point posicion = new Point(x,y);
		return posicion.equals(esquina1) || posicion.equals(esquina2) || posicion.equals(esquina3);
	}

}
