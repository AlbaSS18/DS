package command;

import editor.Figura;

public class CommandConcreteMovimiento implements Command {

	private Figura figura;
	private int dx,dy;
	
	public CommandConcreteMovimiento(Figura figura, int dx, int dy) {
		this.figura = figura;
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public void undo() {
		figura.mover(-dx, -dy);
	}

	@Override
	public void redo() {
		figura.mover(dx, dy);
	}

}
