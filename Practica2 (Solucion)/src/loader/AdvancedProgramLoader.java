package loader;

import java.io.*;
import java.util.*;

import vm.Instruction;

public class AdvancedProgramLoader {

	private Map<String, InstructionCreator> creators = new HashMap<String, InstructionCreator>();

	public void registerLoader(String name, InstructionCreator creator) {
		creators.put(name, creator);
	}

	public List<Instruction> loadProgram(Reader reader) throws IOException {
		List<Instruction> programa = new ArrayList<Instruction>();

		BufferedReader fichero = new BufferedReader(reader);

		String linea;
		while ((linea = fichero.readLine()) != null) {
			if (linea.trim().length() > 0)
				programa.add(creaInstrucción(linea));
		}
		fichero.close();
		return programa;
	}

	private Instruction creaInstrucción(String linea) {
		String[] word = linea.split(" ");

		InstructionCreator creator = creators.get(word[0]);
		if (creator == null)
			throw new IllegalArgumentException();
		return creator.create(word);
	}
}
