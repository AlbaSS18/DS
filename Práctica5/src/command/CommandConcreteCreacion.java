package command;

import editor.Dibujo;
import editor.Figura;

public class CommandConcreteCreacion implements Command{

	private Dibujo dibujo;
	private Figura figura;
	
	public CommandConcreteCreacion(Dibujo dibujo, Figura figura) {
		this.dibujo = dibujo;
		this.figura = figura;
	}

	@Override
	public void undo() {
		dibujo.removeFigura(figura);
	}

	@Override
	public void redo() {
		dibujo.AddFigura(figura);
	}

}
