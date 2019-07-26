package figuras.cuadrado;

import java.awt.Point;

import editor.Figura;

public class FiguraCuadrado implements Figura{
	
	private Point esquina;
	private int alto,ancho;

	public FiguraCuadrado(Point esquina, int alto, int ancho) {
		this.esquina = esquina;
		this.alto = alto;
		this.ancho = ancho;
	}

	public FiguraCuadrado(Point inicio, Point fin) {
		this(inicio,fin.y - inicio.y, fin.x - inicio.x);
	}

	@Override
	public void dibujar() {
		System.out.println("Cuadrado: x = " + this.esquina.getX() + "y = " + this.esquina.getY() + " ancho " + this.ancho + " alto " + this.alto);
	}

	@Override
	public void mover(int dx, int dy) {
		esquina.translate(dx, dy);
	}

	@Override
	public boolean contiene(int x, int y) {
		return (esquina.x <= x && x <= esquina.x + ancho) && (esquina.y <= y && y <= esquina.y + alto);
	}

}
