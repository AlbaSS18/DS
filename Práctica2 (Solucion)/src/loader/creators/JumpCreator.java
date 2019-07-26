package loader.creators;

import vm.Instruction;
import loader.InstructionCreator;
import instructions.*;

public class JumpCreator implements InstructionCreator {

	@Override
	public Instruction create(String[] words) {
		return new Jump(Integer.parseInt(words[1]));
	}

}
