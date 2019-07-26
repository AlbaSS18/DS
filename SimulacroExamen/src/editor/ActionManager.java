package editor;

import java.util.HashMap;
import java.util.Map;

import command.Command;
import command.CommandGrabar;

public class ActionManager {
	
	private Editor editor;
	private Map<String,CommandGrabar> macros = new HashMap<>();
	CommandGrabar macro;
	private boolean isRecordingMacro;
	
	public ActionManager(Editor editor) {
		this.editor = editor;
	}

	public void execute (Command command) {
		command.ejecutar(editor);
		if(isRecordingMacro) {
			macro.addInstruccion(command);
		}
	}
	
	public CommandGrabar getMacro (String nombre) {
		return macros.get(nombre);
	}

	public void record(String nombreGrabacion) {
		macro = new CommandGrabar(nombreGrabacion);
		isRecordingMacro = true;
	}

	public void pararGrabacion() {
		if(!isRecordingMacro) {
			return;
		}
		isRecordingMacro = false;
		String nombreGrabacion = macro.getNombreGrabacion();
		macros.put(nombreGrabacion, macro);
	}

	public void executeMacro(String nombreGrabacion) {
		CommandGrabar c = macros.get(nombreGrabacion);
		if (macro == null) {
			System.out.println("No existe ninguna macro con ese nombre: " + nombreGrabacion);
			return;
		}
		this.execute(c);
	}

}
