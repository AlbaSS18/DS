package parte2;

import parte2.movies.ChildrensMovie;
import parte2.movies.NewReleaseMovie;
import parte2.movies.RegularMovie;

public class Main {

	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");
		
		Movie hotFuzz = new Movie("Hot Fuzz", new NewReleaseMovie());
		Movie toyStory = new Movie("Toy Story", new ChildrensMovie());
		Movie zombiesParty = new Movie("Zombies Party", new RegularMovie());

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
