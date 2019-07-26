package command;

import editor.Editor;

public class CommandInsertar implements Command{

	private String[] wordsToAppend;
	
	public CommandInsertar(String[] wordsToAppend) {
		this.wordsToAppend = wordsToAppend;
	}


	@Override
	public void ejecutar(Editor editor) {
		for (int i = 0; i < wordsToAppend.length; i++) {
			StringBuilder textoQueYaTengo = editor.getText();
			StringBuilder añado = textoQueYaTengo.append(wordsToAppend[i] +  " ");
			editor.setText(añado);
		}
	}

	@Override
	public String toString()
	{
		return "Insertar " + wordsToAppend.toString();
	}
}
