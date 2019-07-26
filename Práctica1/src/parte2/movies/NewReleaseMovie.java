package parte2.movies;

public class NewReleaseMovie implements Category {

	@Override
	public int getPoints(int numberDays) {
		int points = 1;
		if (numberDays > 1)
			points = 2;
		return points;
	}

	@Override
	public double getPrice(int numberDays) {
		return numberDays * 3;
	}

}
