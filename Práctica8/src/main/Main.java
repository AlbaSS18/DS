package main;
import java.io.*;

import encuesta.*;
import observadores.Observador;
import observadores.ObservadorBaseDeDatos;
import observadores.ObservadorDibujarAPartirDeUnVoto;
import observadores.ObservadorGraficoCircular;
import observadores.ObservadorGraficoDeBarras;
import observadores.ObservadorRepetidor;
import observadores.ObserverLineaEstado;

public class Main {

	public static void main(String[] args) throws IOException {
		Pregunta encuesta = new Pregunta("¿Está a favor de la energia nuclear?");
		
		// Rediseño
		
		Observador observadorBaseDeDatos = new ObservadorBaseDeDatos();
		Observador observadorGraficoCircular = new ObservadorGraficoCircular();
		Observador observadorGraficoDeBarras = new ObservadorGraficoDeBarras();
		
		encuesta.adscribir(observadorGraficoDeBarras);
		encuesta.adscribir(observadorGraficoCircular);
		encuesta.adscribir(observadorBaseDeDatos);
		
		// Programa 1
		encuesta.adscribir(new ObserverLineaEstado());
		
		// Programa 2
		
		
		/*
		 * Comentas la línea observadorGraficoDeBarras
		 */
		
		
		// Programa 3
		encuesta.adscribir(new ObservadorDibujarAPartirDeUnVoto(new ObservadorGraficoCircular(),3));
		
		// Programa 4
		encuesta.adscribir(new ObservadorRepetidor(new ObservadorGraficoDeBarras(),3));
			
		// Programa 5
		encuesta.adscribir(new ObservadorDibujarAPartirDeUnVoto(new ObservadorRepetidor(new ObservadorGraficoCircular(),3),4));
		
		
		TextUserInterface userInterface = new TextUserInterface();
		userInterface.rellena(encuesta);
	}

}

