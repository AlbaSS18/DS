package command;

import java.util.ArrayList;
import java.util.List;

import editor.Editor;

public class CommandGrabar implements Command{

	private String nombreGrabacion;
	private List<Command> listaDeInstruccion = new ArrayList<>();
	
	public CommandGrabar(String nombreGrabacion) {
		this.nombreGrabacion = nombreGrabacion;
	}
	
	public String getNombreGrabacion() {
		return nombreGrabacion;
	}

	@Override
	public void ejecutar(Editor editor) {
		for(Command c: listaDeInstruccion) {
			c.ejecutar(editor);
		}
	}

	public void addInstruccion(Command command) {
		listaDeInstruccion.add(command);
	}

	@Override
	public String toString()
	{
		return "Macro " + nombreGrabacion;
	}
}
