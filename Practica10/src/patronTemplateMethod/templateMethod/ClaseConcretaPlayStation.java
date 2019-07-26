package patronTemplateMethod.templateMethod;

import java.awt.Point;

import patronTemplateMethod.game.BallGame;
import patronTemplateMethod.platform.Image2D;
import patronTemplateMethod.platform.playstation.Playstation5API;

public class ClaseConcretaPlayStation extends BallGame{

	private Playstation5API apiPlayStation;
	
	public ClaseConcretaPlayStation() {
		this.apiPlayStation = new Playstation5API();
	}

	@Override
	public Image2D loadImage(String file) {
		return apiPlayStation.loadGraphics(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		apiPlayStation.render(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return apiPlayStation.getJoystick();
	}

}
