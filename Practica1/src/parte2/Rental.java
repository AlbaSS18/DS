package parte2;

public class Rental		// Alquiler 
{
	private Movie movie;
	private int days;
	
	public Rental(Movie movie, int days) 
	{
		this.movie = movie;
		this.days = days;
	}

	public int getDays() 
	{
		return days;
	}

	public Movie getMovie() 
	{
		return movie;
	}

	public double getPrice() {
		return movie.getPrice(days);
	}

	public int getPoints() {
		return movie.getPoints(days);
	}
}
