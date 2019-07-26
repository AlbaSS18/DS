package patronTemplateMethod.templateMethod;

import java.awt.Point;

import patronTemplateMethod.game.BallGame;
import patronTemplateMethod.platform.Image2D;
import patronTemplateMethod.platform.windows.WindowsAPI;

public class ClaseConcretaWindows extends BallGame {
	
	private WindowsAPI apiWindows;
	
	public ClaseConcretaWindows() {
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
