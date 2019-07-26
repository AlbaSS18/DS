package command;

import java.util.regex.Pattern;

import editor.Editor;

public class CommandReemplazar implements Command{
	
	private String linea1, linea2;

	public CommandReemplazar(String line, String line2) {
		this.linea1 = line;
		this.linea2 = line2;
	}

	@Override
	public void ejecutar(Editor editor) {
		editor.setText(new StringBuilder(editor.getText().toString().replaceAll(Pattern.quote(linea1), linea2)));
	}

	@Override
	public String toString()
	{
		return "Reemplazar " + linea1 + " por " + linea2;
	}
}
