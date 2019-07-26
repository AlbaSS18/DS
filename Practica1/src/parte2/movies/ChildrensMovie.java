package parte2.movies;

public class ChildrensMovie implements Category{

	@Override
	public int getPoints(int numberDays) {
		return 1;
	}

	@Override
	public double getPrice(int numberDays) {
		double price = 1.5;
		if(numberDays>3) {
			price += (numberDays - 3) * 1.5;
		}
		return price;
	}

}
