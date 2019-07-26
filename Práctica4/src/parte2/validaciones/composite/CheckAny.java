package parte2.validaciones.composite;

import java.util.Arrays;
import java.util.List;

import parte2.validaciones.Validacion;

public class CheckAny implements Validacion {

	private List<Validacion> list;	
	
	public CheckAny(Validacion... list) {
		this.list = Arrays.asList(list);
	}

	@Override
	public boolean isValid(String texto) {
		for(Validacion v: list) {
			if(v.isValid(texto)) {
				return true;
			}
		}
		return false;
	}

}
