package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.*;

//Singleton design pattern
public class MusicPlaylist {
    //unique instance
    private static volatile MusicPlaylist instance;
    //identify the playlist
    private static String name;
    //the list of all the songs
    private static List<Song> songs = new ArrayList<Song>();

    //we set up the name of the playlist in the beginning
    private MusicPlaylist(String name) {
        instance.name = name;
    }

    //builder pattern magic
    public static MusicPlaylist getInstance(String name) {
        if (instance == null) {
            synchronized (MusicPlaylist.class) {
                if (instance == null) {
                    instance = new MusicPlaylist(name);
                }
            }
        }
        return instance;
    }

    //we want to add new songs
    public static void addSong(Song newSong)
    {
        instance.songs.add((newSong));
    }

    //we want to see the playlist
    public  static void showPlaylist()
    {
        for(Song listSong:songs)
            listSong.listDetails();
    }
}