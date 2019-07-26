package loader.creators;

import vm.Instruction;
import loader.InstructionCreator;
import instructions.*;

public class PushCreator implements InstructionCreator {

	@Override
	public Instruction create(String[] words) {
		return new Push(Integer.parseInt(words[1]));
	}

}
