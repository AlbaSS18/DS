package outputs.filters;

import java.io.IOException;

import fileSystem.Output;

public class Repartidor implements Output{

	private Output output1;
	private Output output2;
	
	public Repartidor(Output output1, Output output2) {
		this.output1 = output1;
		this.output2 = output2;
	}

	@Override
	public void send(char c) throws IOException {
		output1.send(c);
		output2.send(c);
	}

	@Override
	public void close() throws IOException {
		output1.close();
		output2.close();
	}

}
