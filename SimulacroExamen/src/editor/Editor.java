package editor;

import command.CommandAbrir;
import command.CommandBorrar;
import command.CommandInsertar;
import command.CommandReemplazar;

public class Editor {
	
	private StringBuilder texto;
	private ActionManager actionManager = new ActionManager(this);
	
	public void abrir(String line) {
		actionManager.execute(new CommandAbrir(line));
	}
	
	public void insertar(String[] wordsToAppend) {
		actionManager.execute(new CommandInsertar(wordsToAppend));
	}
	
	public void borrar() {
		actionManager.execute(new CommandBorrar());
	}
	
	public void reemplazar(String line, String line2) {
		actionManager.execute(new CommandReemplazar(line,line2));
	}

	public StringBuilder getText() {
		return texto;
	}
	
	public void setText(StringBuilder texto) {
		this.texto = texto;
	}

	public void grabar(String nombreGrabacion) {
		actionManager.record(nombreGrabacion);
	}

	public void parar() {
		actionManager.pararGrabacion();
	}

	public void ejecutar(String nombreGrabacion) {
		actionManager.executeMacro(nombreGrabacion);
	}

}
