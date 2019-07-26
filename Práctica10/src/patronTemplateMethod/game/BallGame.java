package patronTemplateMethod.game;

import java.awt.Point;

import patronTemplateMethod.platform.Image2D;

/* Esta clase/paquete ser�a el c�digo del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public abstract class BallGame {
	// Seleccionar para qu� plataforma se quiere generar el juego
	// private Platform platform = Platform.ANDROID;
	// private Platform platform = Platform.WINDOWS;
	// private Platform platform = Platform.PLAYSTATION;

	public void play() {

		Image2D image = loadImage("Bola.jpg");

		// L�gica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra l�gica del juego...
			drawBall(image, point);
		}
	}
	
	public abstract Image2D loadImage(String file); 
	public abstract void drawBall(Image2D image, Point point); 
	public abstract Point getPosition(); 
}
