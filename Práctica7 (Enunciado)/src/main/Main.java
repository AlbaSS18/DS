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

		// Dise�o inicial
		fs.copy("privado.txt", new NormalizarSaltosLinea(new FileOutput("copia.txt")));
		fs.copy("privado.txt", new Encriptar(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new Encriptar(new EliminarEspaciosRepetidos(new BluetoothOutput("iPhone"))) );
	
		// Modificaci�n 1
		fs.copy("privado.txt", new NormalizarSaltosLinea(new Encriptar(new FileOutput("copia.txt"))));
		fs.copy("privado.txt", new NormalizarSaltosLinea(new FileOutput("copia.txt")));
		
		
		// Modificaci�n 2
		fs.copy("privado.txt", new Encriptar(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new EliminarEspaciosRepetidos(new InternetOutput("1.1.1.1")));
		fs.copy("privado.txt", new EliminarEspaciosRepetidos(new NormalizarSaltosLinea(new InternetOutput("1.1.1.1"))));
		
		// Modificaci�n 3
		ContadorCaracteres c = new ContadorCaracteres(new FileOutput("copia.txt"));
		fs.copy("privado.txt",new NormalizarSaltosLinea(c));
		System.out.println("Se han enviado " + c.getContador() + " caracteres");		
		
		// Modificaci�n 4
		ContadorCaracteres caracteresDespues = new ContadorCaracteres(new InternetOutput("1.1.1.1"));
		ContadorCaracteres caracteresAntes = new ContadorCaracteres(new NormalizarSaltosLinea(caracteresDespues));
		fs.copy("privado.txt",caracteresAntes);
		System.out.println("Inicialmente hab�a " + caracteresAntes.getContador() + "# caracteres");
		System.out.println("Despu�s de normalizar, se han enviado " + caracteresDespues.getContador() + "# caracteres");
		
		// Modificaci�n 5
		fs.copy("privado.txt", new Encriptar(new Repartidor(new InternetOutput("1.1.1.1"), new BluetoothOutput("iPhone"))));
	}

}
