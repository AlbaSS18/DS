package outputs.filters;

import java.io.IOException;

import fileSystem.Output;

public class EliminarEspaciosRepetidos implements Output {
	
	private Output output;
	private char lastChar = 0;
	

	public EliminarEspaciosRepetidos(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		if(c == ' ' && lastChar == ' ' ) {
			return;
		}
		output.send(c);
		lastChar = c;
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
