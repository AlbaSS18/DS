package loader.creators;

import vm.Instruction;
import loader.InstructionCreator;
import instructions.*;

public class InputCreator implements InstructionCreator {

	@Override
	public Instruction create(String[] words) {
		return new Input();
	}

}
