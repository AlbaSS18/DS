package outputs.filters;

import java.io.IOException;

import fileSystem.Output;

public class ContadorCaracteres implements Output{

	private Output output;
	private int contador;

	public ContadorCaracteres(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) throws IOException {
		contador ++;
		output.send(c);
	}

	@Override
	public void close() throws IOException {
		output.close();
	}
	
	public int getContador() {
		return contador;
	}

	
}
