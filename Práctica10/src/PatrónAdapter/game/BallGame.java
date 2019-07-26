package Patr�nAdapter.game;

import java.awt.Point;

import Patr�nAdapter.adaptador.Api;
import Patr�nAdapter.platform.Image2D;

/* Esta clase/paquete ser�a el c�digo del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

//enum Platform {
//	ANDROID, WINDOWS, PLAYSTATION
//};

public class BallGame {
	// Seleccionar para qu� plataforma se quiere generar el juego
	// private Platform platform = Platform.ANDROID;
	// private Platform platform = Platform.WINDOWS;
	// private Platform platform = Platform.PLAYSTATION;

	public void play(Api api) {

		Image2D image = api.loadImage("Bola.jpg");

		// L�gica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = api.getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra l�gica del juego...
			api.drawBall(image, point);
		}
	}

}
