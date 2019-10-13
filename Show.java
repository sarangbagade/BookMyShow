import java.util.*;

class Show
{
	int showId;
	static int count=0;
	int movie_id;
	Date start_time;
	//start_time contains both date of show
	//and start time of show
	int duration;
	//duration of the show in minutes
	int screenId;
	Show(int movie_id, Date start_time, int screenId)
	{
		this.showId = ++Show.count;
		this.movie_id = movie_id;
		this.start_time = start_time;
		this.screenId = screenId;
	}
}