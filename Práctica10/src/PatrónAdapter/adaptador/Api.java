package PatrónAdapter.adaptador;

import java.awt.Point;

import PatrónAdapter.platform.Image2D;

public interface Api {

	Image2D loadImage(String file);
	void drawBall(Image2D image, Point point);
	Point getPosition();
}
