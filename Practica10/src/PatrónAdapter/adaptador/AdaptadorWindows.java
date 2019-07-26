package Patr�nAdapter.adaptador;

import java.awt.Point;

import Patr�nAdapter.platform.Image2D;
import Patr�nAdapter.platform.windows.WindowsAPI;

public class AdaptadorWindows implements Api{
	
	private WindowsAPI apiWindows;
	
	public AdaptadorWindows() {
		this.apiWindows = new WindowsAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return apiWindows.loadFile(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		apiWindows.paint(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return apiWindows.getMouseClick();
	}

}
