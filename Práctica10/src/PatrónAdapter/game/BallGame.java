package PatrónAdapter.game;

import java.awt.Point;

import PatrónAdapter.adaptador.Api;
import PatrónAdapter.platform.Image2D;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

//enum Platform {
//	ANDROID, WINDOWS, PLAYSTATION
//};

public class BallGame {
	// Seleccionar para qué plataforma se quiere generar el juego
	// private Platform platform = Platform.ANDROID;
	// private Platform platform = Platform.WINDOWS;
	// private Platform platform = Platform.PLAYSTATION;

	public void play(Api api) {

		Image2D image = api.loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = api.getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			api.drawBall(image, point);
		}
	}

}
