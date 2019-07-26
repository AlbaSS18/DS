package parte2.validaciones;

import parte2.validaciones.composite.CheckAll;

public class ValidarCodigoPostal extends CheckAll {

	public ValidarCodigoPostal() {
		super(new ValidarDigitos(), new ValidarLongitud(5));
	}
}
