package patronTemplateMethod.templateMethod;

import java.awt.Point;

import patronTemplateMethod.game.BallGame;
import patronTemplateMethod.platform.Image2D;
import patronTemplateMethod.platform.android.AndroidAPI;

public class ClaseConcretaAndroid extends BallGame{

	private AndroidAPI apiAndroid;
	
	public ClaseConcretaAndroid() {
		this.apiAndroid = new AndroidAPI();
	}

	@Override
	public Image2D loadImage(String file) {
		return apiAndroid.loadResource(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		apiAndroid.draw(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return apiAndroid.getTouch();
	}

}
