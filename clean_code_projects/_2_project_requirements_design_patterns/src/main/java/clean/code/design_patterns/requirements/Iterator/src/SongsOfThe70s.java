package clean.code.design_patterns.requirements.Iterator.src;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{

    // ArrayList holds SongInfo objects
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    // Add a SongInfo object to the end of the ArrayList
    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }

    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;

    }

    public Iterator createIterator() {
        return bestSongs.iterator();
    }

}