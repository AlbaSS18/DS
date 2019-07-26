package command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import editor.Editor;

public class CommandAbrir implements Command {
	
	private String fichero;

	public CommandAbrir(String fichero) {
		if (fichero == null || fichero.trim().length() == 0)
			throw new IllegalArgumentException("¡La acción de abrir un fichero necesita el nombre del fichero!");
		this.fichero = fichero;
	}

	@Override
	public void ejecutar(Editor editor) {
		try {
			editor.setText(readFile(fichero));
		} catch (IOException e) {
			System.out.printf("No se pudo abrir el fichero '%s': %s", fichero, e.getMessage());
		}
	}
	
	
	private StringBuilder readFile(String filename) throws IOException 
	{
		BufferedReader input = new BufferedReader(new FileReader(filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}
	
	@Override
	public String toString()
	{
		return "Abrir " + fichero;
	}
	

}
