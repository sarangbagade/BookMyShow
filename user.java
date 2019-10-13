import java.util.*;

class User
{
	int user_id;
	static private int count=0;
	String userName;
	String emailId;
	int mobile_number;
	HashMap<Integer, Booking> bookingsArray;
	User(String userName, String emailId)
	{
		this.user_id = ++User.count;
		this.userName = userName;
		this.emailId = emailId;
		this.bookingsArray = new HashMap<Integer, Booking>();
	}
	void addBooking(int user_id, int show_id, ArrayList<Integer> seats)
	{
		Booking b = new Booking(user_id, show_id, seats);
		this.bookingsArray.put(b.booking_id, b);
	}
	void removeBooking(int bookingId)
	{
		this.bookingsArray.remove(bookingId);
	}
	
}