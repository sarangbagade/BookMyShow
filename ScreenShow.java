import java.util.ArrayList;
import java.util.HashMap;

//this class is mapping between screen and show
class ScreenShow
{
	static private HashMap<Integer, ArrayList<Integer>> hashTable;
	ScreenShow()
	{
		ScreenShow.hashTable = new HashMap<>();
	}
	static void addShow(int screenId, int showId)
	{
		if(!ScreenShow.hashTable.containsKey(screenId)) {
			ScreenShow.hashTable.put(screenId, new ArrayList<Integer>());
		}
		ScreenShow.hashTable.get(screenId).add(showId);
	}
	static void removeShow(int screenId, int showId)
	{	
		if(ScreenShow.hashTable.containsKey(screenId)) {
			ScreenShow.hashTable.get(screenId).remove(showId);
		}
	}
}