package PatrónAdapter.game;

import PatrónAdapter.adaptador.AdaptadorAndroid;
import PatrónAdapter.adaptador.AdaptadorPlayStation;
import PatrónAdapter.adaptador.AdaptadorWindows;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame();
		
		game.play(new AdaptadorAndroid());
		game.play(new AdaptadorPlayStation());
		game.play(new AdaptadorWindows());
	}
}
