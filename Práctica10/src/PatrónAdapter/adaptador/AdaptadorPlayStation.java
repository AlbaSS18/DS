package PatrónAdapter.adaptador;

import java.awt.Point;

import PatrónAdapter.platform.Image2D;
import PatrónAdapter.platform.playstation.Playstation5API;

public class AdaptadorPlayStation implements Api{
	
	private Playstation5API apiPlaystation;
	
	public AdaptadorPlayStation() {
		this.apiPlaystation = new Playstation5API();
	}

	@Override
	public Image2D loadImage(String file) {
		return apiPlaystation.loadGraphics(file);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		apiPlaystation.render(point.x, point.y, image);
	}

	@Override
	public Point getPosition() {
		return apiPlaystation.getJoystick();
	}

}
