package loader;

import vm.Instruction;

public interface InstructionCreator {
	public Instruction create(String[] words);
}
