package behavioural.iterator.pattern;

import java.util.List;

public class MaleFansIterator implements FansIterator {
	

	FilmWatchersRepository repository;

	int current;
	
	public MaleFansIterator(FilmWatchersRepository repository) {

		this.repository = repository;

		this.current = 0;
	}


	@Override
	public boolean hasNext() {
		
		

		List<FilmFan> filmFans = this.repository.filmFanList;
		
		if(this.current == filmFans.size()) {
			
			return false;
		}
		
		FilmFan fan = filmFans.get(this.current);

		if (fan.getGender().equals("male")) {

			return true;
		} else {

			while (!fan.getGender().equals("male") && this.current < filmFans.size() - 1) {

				this.current++;

				fan = filmFans.get(this.current);
			}

			if (fan.getGender().equals("male")) {

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
