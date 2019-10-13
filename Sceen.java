
import java.util.*;

//this class represents screen present in the multi screen theater
class Screen
{
	int screenId;
	static private int count=0;
	int theareId;
	ArrayList<Boolean> seat_ids;
	Screen(int id, int seats_count)
	{
		this.screenId = ++Screen.count;
		this.theareId = id;
		this.seat_ids = new ArrayList<Boolean>(seats_count);
	}
}