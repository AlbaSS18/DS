package editor;

import editor.herramientas.HerramientaSeleccion;

public class Editor {
	
	private Herramienta herramientaActual;
	private Herramienta herramientaPrincipal;
	private Dibujo dibujo;

	public Editor(Dibujo dibujo) {
		setDibujo(dibujo);
		herramientaActual = herramientaPrincipal = createDefaultTool();
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void dibujar() {
		dibujo.dibujar();
	}
	
	protected Herramienta createDefaultTool() {
		return new HerramientaSeleccion(this);
	}
	
	public void setHerramienta(Herramienta herramienta) {
		if(herramienta != null) {
			herramientaActual = herramienta;
		}
	}
	
	public Herramienta getHerramienta() {
		return herramientaPrincipal;
	}
	
	public void pinchar(int x, int y) {
		herramientaActual.pinchar(x, y);
	}
	
	public void mover(int x, int y) {
		herramientaActual.pinchar(x, y);
	}
	
	public void soltar(int x, int y) {
		herramientaActual.pinchar(x, y);
	}
	
	public void finHerramienta() {
		herramientaActual = herramientaPrincipal;
	}
}
