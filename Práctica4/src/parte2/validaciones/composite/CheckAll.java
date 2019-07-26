package parte2.validaciones.composite;

import java.util.Arrays;
import java.util.List;

import parte2.validaciones.Validacion;

public class CheckAll implements Validacion {

	private List<Validacion> list;	
	
	public CheckAll(Validacion... list) {
		this.list = Arrays.asList(list);
	}

	@Override
	public boolean isValid(String texto) {
		
		for(Validacion v: list) {
			if(!v.isValid(texto)) {
				return false;
			}
		}
		return true;
	}	
}
