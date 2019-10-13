import java.util.*;

//this class is mapping between theater and screen
class TheatreScreen
{
	static private HashMap<Integer, ArrayList<Integer>> hashTable;
	TheatreScreen()
	{
		TheatreScreen.hashTable = new HashMap<>();
	}
	static void addScreen(int theatreId, int screenId)
	{
		if(!TheatreScreen.hashTable.containsKey(theatreId)) {
			TheatreScreen.hashTable.put(theatreId, new ArrayList<Integer>());
		}
		TheatreScreen.hashTable.get(theatreId).add(screenId);
	}
	static void removeScreen(int theatreId, int screenId)
	{	
		if(TheatreScreen.hashTable.containsKey(theatreId)) {
			TheatreScreen.hashTable.get(theatreId).remove(screenId);
		}
	}
}