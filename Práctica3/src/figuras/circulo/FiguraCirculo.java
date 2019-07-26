package figuras.circulo;

import java.awt.Point;

import editor.Figura;

public class FiguraCirculo implements Figura{

	private Point centro;
	private int radio;
	
	public FiguraCirculo(Point centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}

	@Override
	public void dibujar() {
		System.out.println("Círculo: centro = " + this.centro + "radio = " + this.radio);
	}

	@Override
	public void mover(int dx, int dy) {
		centro.translate(dx, dy);
	}

	@Override
	public boolean contiene(int x, int y) {
		double distancia = Math.sqrt(Math.pow(x - centro.x, 2) + Math.pow(y - centro.y, 2));
		return distancia < radio;
	}

}
