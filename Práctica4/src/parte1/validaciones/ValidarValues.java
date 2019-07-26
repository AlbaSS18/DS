package parte1.validaciones;

public class ValidarValues implements Validacion{

	private String[] valores;
	
	public ValidarValues(String... valores) {
		this.valores = valores;
	}
	
	@Override
	public boolean isValid(String texto) {
		for (String valor : valores) {
			if (texto.toLowerCase().equals(valor.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
