package org.howard.edu.lsp.exam.question42;

import java.util.HashSet;
import java.util.*;

public class SongsDatabase 
{
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		/* Add a song title to a genre */
	 public void addSong(String genre , String songTitle)
	 {
	        //we first check if the genre is already present in our map
	    if(!map.containsKey(genre))
	    {
	        //new HashSet for this genre
	        map.put(genre, new HashSet<String>());
	    }
	    //add the song to the set of genre
	        map.get(genre).add(songTitle);
	 }

	/* Return the Set that contains all songs for a genre */
	 public Set<String> getSongs(String genre)
	 {
		return map.getOrDefault(genre,new HashSet<String>());
	 }

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle)
	{
        for(Map.Entry<String,Set<String>> i : map.entrySet())
        {
            if(i.getValue().contains(songTitle))
            {
                return i.getKey();
            }
        }
   
        return null;
    }

	public static void main(String[] args)
	{
		SongsDatabase db = new SongsDatabase();
		
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		Set<String> songs = db.getSongs("Rap");
		System.out.println( db.getGenreOfSong("Savage") );// prints “Rap”
		System.out.println( db.getGenreOfSong("Gin and Juice") );// prints “Rap”
		System.out.println( db.getGenreOfSong("Always There") );// prints “Jazz”
	}
}
