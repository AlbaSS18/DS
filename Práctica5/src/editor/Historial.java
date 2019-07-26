package editor;

import java.util.Stack;

import command.Command;

public class Historial {

	private Stack<Command> undos = new Stack<>();
	private Stack<Command> redos = new Stack<>();
	
	public void añadeCambio(Command cambio) {
		undos.push(cambio);
		redos.clear();
	}
	
	public void undo() {
		if(undos.isEmpty()) {
			System.out.println("Traza: no es posible hacer undo");
			return;
		}
		Command cambio = undos.pop();
		cambio.undo();
		redos.push(cambio);
	}

	public void redo() {
		if(redos.isEmpty()) {
			System.out.println("Traza: no es posible hacer redo");
			return;
		}
		Command cambio = redos.pop();
		cambio.redo();
		undos.push(cambio);
	}

}
