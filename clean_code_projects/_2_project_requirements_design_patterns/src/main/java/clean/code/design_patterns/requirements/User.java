package clean.code.design_patterns.requirements;

//music streaming user profile
public class User {
    private String userName;

    public User(String name) {
        this.userName = name;
    }

    public String getUserName() {
        return this.userName;
    }

    //each user is able to add songs
    public void addSong(Song newSong)
    {
        //the singleton in action
        MusicPlaylist playlist = MusicPlaylist.getInstance("Party Mix 2023");
        playlist.addSong(newSong);
    }

    //each user is able to see the playlist
    public void showPlaylist()
    {
        //the singleton in action
        MusicPlaylist playlist = MusicPlaylist.getInstance("Party Mix 2023");
        playlist.showPlaylist();
    }

}
