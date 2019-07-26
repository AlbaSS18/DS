package outputs.filters;

import java.io.IOException;

import fileSystem.Output;

public class Encriptar implements Output{

	private Output output;
	
	public Encriptar(Output output) {
		this.output = output;
	}
	
	@Override
	public void send(char c) throws IOException {
		if(Character.isLetterOrDigit(c)) {
			output.send((char) (c+1));
		}
		else {
			output.send(c);
		}
		
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
