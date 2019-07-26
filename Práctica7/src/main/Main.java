package main;
import java.io.*;

import fileSystem.FileSystem;
import outputs.*;
import outputs.filters.ContadorCaracteres;
import outputs.filters.EliminarEspaciosRepetidos;
import outputs.filters.Encriptar;
import outputs.filters.NormalizarSaltosLinea;
import outputs.filters.Repartidor;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem fs = new FileSystem();

		// Diseño inicial
		fs.copy("privado.txt", new NormalizarSaltosLinea(new FileOutput("copia.txt")));
		fs.copy("privado.txt", new Encriptar(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new Encriptar(new EliminarEspaciosRepetidos(new BluetoothOutput("iPhone"))) );
	
		// Modificación 1
		fs.copy("privado.txt", new NormalizarSaltosLinea(new Encriptar(new FileOutput("copia.txt"))));
		fs.copy("privado.txt", new NormalizarSaltosLinea(new FileOutput("copia.txt")));
		
		
		// Modificación 2
		fs.copy("privado.txt", new Encriptar(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new EliminarEspaciosRepetidos(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new EliminarEspaciosRepetidos(new NormalizarSaltosLinea(new InternetOutput("1.1.1.1"))));
		
		// Modificación 3
		ContadorCaracteres c = new ContadorCaracteres(new FileOutput("copia.txt"));
		fs.copy("privado.txt",new NormalizarSaltosLinea(c));
		System.out.println("Se han enviado " + c.getContador() + " caracteres");		
		
		// Modificación 4
		ContadorCaracteres caracteresDespues = new ContadorCaracteres(new InternetOutput("1.1.1.1"));
		ContadorCaracteres caracteresAntes = new ContadorCaracteres(new NormalizarSaltosLinea(caracteresDespues));
		fs.copy("privado.txt",caracteresAntes);
		System.out.println("Inicialmente había " + caracteresAntes.getContador() + "# caracteres");
		System.out.println("Después de normalizar, se han enviado " + caracteresDespues.getContador() + "# caracteres");
		
		// Modificación 5
		fs.copy("privado.txt", new Encriptar(new Repartidor(new InternetOutput("1.1.1.1"), new BluetoothOutput("iPhone"))));
	}

}
