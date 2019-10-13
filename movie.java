
class Movie
{
	int movie_id;
	static int count = 0;
	String movie_name;
	float rating;
	enum genre_type{
		comedy, thriller, romantic, action, adventure, crime, drama, horror, scifi, mystery;
	}
	genre_type genre;
	enum format_type{
		threed, twod, fourd;
	}
	format_type format;
	
	Movie(String name, genre_type genre, format_type format)
	{
		this.movie_id = ++Movie.count;
		this.movie_name = name;
		rating = 0;
		this.genre = genre;
		this.format = format;
	}
}