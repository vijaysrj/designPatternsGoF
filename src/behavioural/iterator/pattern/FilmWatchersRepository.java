package behavioural.iterator.pattern;

import java.util.ArrayList;
import java.util.List;

public class FilmWatchersRepository {

	List<FilmFan> filmFanList = new ArrayList<FilmFan>();
	
	public void add(FilmFan fan) {

		this.filmFanList.add(fan);
	}
	
	

}
