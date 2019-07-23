package main;

import java.io.*;
import java.util.*;

import loader.ConfigurableLoader;
import vm.*;

public class Main {

	public static void main(String[] args) throws Exception {
		ConfigurableLoader loader = new ConfigurableLoader("src/config.txt");
		List<Instruction> program = loader.loadProgram(new FileReader("programa.txt"));

		VirtualMachine vm = new VirtualMachine(program);
		vm.run();
	}

	
}
