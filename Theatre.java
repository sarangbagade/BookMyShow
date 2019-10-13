
import java.util.*;

class Theatre
{
	int theatreId;
	String theatreName;
	String address;
	String city;
	static private int count=0;
	HashMap<Integer, Show> showsArray;
	Theatre(String name, String city, String address)
	{
		this.showsArray = new HashMap<Integer, Show>();
		this.theatreId = ++Theatre.count;
		this.theatreName = name;
		this.city = city;
		this.address = address;
	}
	
}