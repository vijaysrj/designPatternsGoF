package behavioural.iterator.pattern;

public class Client {

	public static void main(String a[]) {

		FilmFan fan1 = new FilmFan("Hrithik", "male", 35);
		FilmFan fan2 = new FilmFan("Gayathri", "female", 25);
		FilmFan fan3 = new FilmFan("Renuka", "female", 12);
		FilmFan fan4 = new FilmFan("Raghav", "male", 32);
		FilmFan fan5 = new FilmFan("Gopal", "male", 11);
		FilmFan fan6 = new FilmFan("Kannagi", "female", 28);
		FilmFan fan7 = new FilmFan("Kumar", "male", 45);
		FilmFan fan8 = new FilmFan("Loyala", "female", 23);
		FilmFan fan9 = new FilmFan("Agarnika", "female", 10);
		FilmFan fan10 = new FilmFan("Ramayan", "male", 28);

		FilmWatchersRepository repository = new FilmWatchersRepository();
		repository.add(fan1);
		repository.add(fan2);
		repository.add(fan3);
		repository.add(fan4);
		repository.add(fan5);
		repository.add(fan6);
		repository.add(fan7);
		repository.add(fan8);
		repository.add(fan9);
		repository.add(fan10);

		System.out.println("List of female fans");

		FansIterator femaleIterator = new FemaleFansIterator(repository);

		while (femaleIterator.hasNext()) {

			FilmFan fan = femaleIterator.next();

			System.out.println(fan);
		}

		System.out.println("List of male fans");

		FansIterator maleIterator = new MaleFansIterator(repository);

		while (maleIterator.hasNext()) {

			FilmFan fan = maleIterator.next();

			System.out.println(fan);
		}

		System.out.println("List of kids fans");

		FansIterator kidsIterator = new KidFansIterator(repository);

		while (kidsIterator.hasNext()) {

			FilmFan fan = kidsIterator.next();

			System.out.println(fan);
		}

	}
}
