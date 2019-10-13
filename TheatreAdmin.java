import java.util.*;

class TheatreAdmin
{
	int adminId;
	static private int count=0;
	String adminName;
	String emailId;
	int theatreId;
	TheatreAdmin(int theatreId, String name, String email)
	{
		this.adminId = ++TheatreAdmin.count;
		this.adminName = name;
		this.emailId = email;
		this.theatreId = theatreId;
	}
	void addScreen(int seatsCount)
	{
		Screen s = new Screen(this.theatreId, seatsCount);
		TheatreScreen.addScreen(this.theatreId, s.screenId);
	}
	void removeScreen(int screenId)
	{
		TheatreScreen.removeScreen(this.theatreId, screenId);
	}
	void addShow(int movieId, Date startTime, int screenId)
	{
		Show s = new Show(movieId, startTime, screenId);
		ScreenShow.addShow(screenId, s.showId);
	}
	void removeShow(int screenId, int showId)
	{
		ScreenShow.removeShow(screenId, showId);
	}
}