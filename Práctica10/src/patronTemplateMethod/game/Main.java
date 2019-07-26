package patronTemplateMethod.game;

import patronTemplateMethod.templateMethod.ClaseConcretaAndroid;
import patronTemplateMethod.templateMethod.ClaseConcretaPlayStation;
import patronTemplateMethod.templateMethod.ClaseConcretaWindows;

public class Main {
	public static void main(String[] args) {
		BallGame claseConcretaAndroid = new ClaseConcretaAndroid();
		claseConcretaAndroid.play();
		
		BallGame claseConcretaWindows = new ClaseConcretaWindows();
		claseConcretaWindows.play();
		
		BallGame claseConcretaPlayStation = new ClaseConcretaPlayStation();
		claseConcretaPlayStation.play();
		
		
	}
}
