import java.util.*;

class Booking
{
	int booking_id;
	static private int count=0; 
	int user_id;
	//this is id of movie in particular language
	int show_id;
	Booking(int user_id, int show_id, ArrayList<Integer> seats)
	{
		 this.booking_id = ++Booking.count;
		 this.user_id = user_id;
		 this.show_id = show_id;
	}
	//get movie shows for particular theatre
//	ArrayList<Show> getShows(int theatreId)
//	{
//		
//	}
	//get theatres for perticular movie
	//how to do this with this implementation ?
//	ArrayList<Theatre> getTheatres(int movieId)
//	{
//		
//	}
}