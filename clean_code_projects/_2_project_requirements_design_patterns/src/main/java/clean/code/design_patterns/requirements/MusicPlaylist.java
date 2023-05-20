package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.*;

public class MusicPlaylist {
    private static volatile MusicPlaylist instance;
    private static String name;
    private static List<Song> songs = new ArrayList<Song>();

    private MusicPlaylist(String name) {
        instance.name = name;
    }

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

    public static void addSong(Song newSong)
    {
        instance.songs.add((newSong));
    }

    public  static void showPlaylist()
    {
        for(Song listSong:songs)
            listSong.listDetails();
    }
}