package parte1.main;
import parte1.formulario.Campo;
import parte1.formulario.Formulario;
import parte1.validaciones.ValidarDigitos;
import parte1.validaciones.ValidarTexto;
import parte1.validaciones.ValidarValues;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre",new ValidarTexto()));
		formulario.addCampo(new Campo("Apellido", new ValidarTexto()));
		formulario.addCampo(new Campo("Teléfono", new ValidarDigitos()));
		formulario.addCampo(new Campo("Ciudad", new ValidarValues("Santander","Oviedo","Cadiz")));

		formulario.PideDatos();
	}
}
