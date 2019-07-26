package parte2.validaciones;

import parte1.validaciones.Validacion;

public class ValidarTexto implements parte2.validaciones.Validacion, Validacion{

	@Override
	public boolean isValid(String texto) {
		for (char ch : texto.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}

}
