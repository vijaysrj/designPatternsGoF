package behavioural.iterator.pattern;

import java.util.List;

public class FemaleFansIterator implements FansIterator {

	FilmWatchersRepository repository;

	int current;

	public FemaleFansIterator(FilmWatchersRepository repository) {

		this.repository = repository;

		this.current = 0;
	}

	@Override
	public boolean hasNext() {

		List<FilmFan> filmFans = this.repository.filmFanList;
		FilmFan fan = filmFans.get(this.current);

		if (fan.getGender().equals("female")) {

			return true;
		} else {

			while (!fan.getGender().equals("female") && this.current < filmFans.size() - 1) {

				this.current++;

				fan = filmFans.get(this.current);
			}

			if (fan.getGender().equals("female")) {

				return true;
			}
		}

		return false;

	}

	@Override
	public FilmFan next() {

		FilmFan fan = this.repository.filmFanList.get(this.current);
		
		this.current++;

		return fan;

	}

}
