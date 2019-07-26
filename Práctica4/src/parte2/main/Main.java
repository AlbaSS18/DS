package parte2.main;
import parte2.formulario.Campo;
import parte2.formulario.Formulario;
import parte2.validaciones.ValidarCodigoPostal;
import parte2.validaciones.ValidarDigitos;
import parte2.validaciones.ValidarLongitud;
import parte2.validaciones.ValidarMayorQue;
import parte2.validaciones.ValidarMenorQue;
import parte2.validaciones.ValidarTexto;
import parte2.validaciones.ValidarValues;
import parte2.validaciones.composite.CheckAll;
import parte2.validaciones.composite.CheckAny;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre",new ValidarTexto()));
		formulario.addCampo(new Campo("Apellido", new ValidarTexto()));
		formulario.addCampo(new Campo("Teléfono", new ValidarDigitos()));
		formulario.addCampo(new Campo("Ciudad", new ValidarValues("Santander","Oviedo","Cadiz")));
		
		
		formulario.addCampo(new Campo("Código del producto", new ValidarLongitud(4)));
		formulario.addCampo(new Campo("Código postal", new CheckAll(new ValidarDigitos(), new ValidarLongitud(5))));
		formulario.addCampo(new Campo("Edad", new CheckAll(new ValidarDigitos(), new ValidarMayorQue(18))));
		formulario.addCampo(new Campo("Sueldo", new CheckAll(new ValidarDigitos(), new ValidarMayorQue(800), new ValidarMenorQue(1200))));
		formulario.addCampo(new Campo("Ubicación", new CheckAny(new ValidarValues("Santander","Oviedo","Cádiz"), new ValidarCodigoPostal())));
		formulario.addCampo(new Campo("Código de promoción", new CheckAny(new ValidarTexto(), new CheckAll(new ValidarDigitos(),new ValidarLongitud(3)))));
		
		
		formulario.PideDatos();
	}
}
