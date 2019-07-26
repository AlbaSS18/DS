package loader.creators;

import vm.Instruction;
import loader.InstructionCreator;
import instructions.*;

public class JumpGreaterCreator implements InstructionCreator {

	@Override
	public Instruction create(String[] words) {
		return new JumpGreater(Integer.parseInt(words[1]));
	}

}
