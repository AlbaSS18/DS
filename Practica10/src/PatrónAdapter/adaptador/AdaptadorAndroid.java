package PatrónAdapter.adaptador;

import java.awt.Point;

import PatrónAdapter.platform.Image2D;
import PatrónAdapter.platform.android.AndroidAPI;

public class AdaptadorAndroid implements Api{
	
	private AndroidAPI apiAndroid;
	
	public AdaptadorAndroid() {
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
