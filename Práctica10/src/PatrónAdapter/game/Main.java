package Patr�nAdapter.game;

import Patr�nAdapter.adaptador.AdaptadorAndroid;
import Patr�nAdapter.adaptador.AdaptadorPlayStation;
import Patr�nAdapter.adaptador.AdaptadorWindows;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame();
		
		game.play(new AdaptadorAndroid());
		game.play(new AdaptadorPlayStation());
		game.play(new AdaptadorWindows());
	}
}
