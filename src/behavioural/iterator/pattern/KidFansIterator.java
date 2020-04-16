package behavioural.iterator.pattern;

import java.util.List;

public class KidFansIterator implements FansIterator {

	FilmWatchersRepository repository;

	int current;

	public KidFansIterator(FilmWatchersRepository repository) {

		this.repository = repository;

		this.current = 0;
	}

	@Override
	public boolean hasNext() {

		List<FilmFan> filmFans = this.repository.filmFanList;

		if (this.current == filmFans.size()) {

			return false;
		}

		FilmFan fan = filmFans.get(this.current);

		if (fan.getAge() < 13) {

			return true;
		} else {

			while (fan.getAge() > 12 && this.current < filmFans.size() - 1) {

				this.current++;

				fan = filmFans.get(this.current);
			}

			if (fan.getAge() < 13) {

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
