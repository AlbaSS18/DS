package parte2.validaciones;

public class ValidarMenorQue implements Validacion{

	private int numero;

	public ValidarMenorQue(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean isValid(String texto) {
		if(Integer.parseInt(texto)<numero) {
			return true;
		}
		return false;
	}

	
}
