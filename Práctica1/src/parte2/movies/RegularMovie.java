package parte2.movies;

public class RegularMovie implements Category{

	@Override
	public int getPoints(int numberDays) {
		return 1;
	}

	@Override
	public double getPrice(int numberDays) {
		double price = 2;
		if (numberDays > 2)
			price += (numberDays - 2) * 1.5;
		return price;
	}

}
