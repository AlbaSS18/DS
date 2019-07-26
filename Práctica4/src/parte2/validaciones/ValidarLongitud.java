package parte2.validaciones;

public class ValidarLongitud implements Validacion{

	private int longitud;
	
	public ValidarLongitud(int i) {
		this.longitud = i;
	}

	@Override
	public boolean isValid(String texto) {
		if(texto.length() == longitud) {
			return true;
		}
		return false;
	}

}
