package loader;

import java.io.*;

public class ConfigurableLoader extends AdvancedProgramLoader {

	public ConfigurableLoader(String configurationFile) throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader(configurationFile));

		String linea;
		while ((linea = fichero.readLine()) != null) {
			String[] words = linea.split(":");
			Class c = Class.forName(words[1]);
			registerLoader(words[0], (InstructionCreator) c.newInstance());
		}
		fichero.close();
	}
}
