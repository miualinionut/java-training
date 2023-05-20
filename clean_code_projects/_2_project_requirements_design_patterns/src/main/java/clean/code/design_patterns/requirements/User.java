package clean.code.design_patterns.requirements;

public class User {
    private String userName;

    public User(String name) {
        this.userName = name;
    }

    public String getUserName() {
        return this.userName;
    }

    public void addSong(Song newSong)
    {
        MusicPlaylist playlist = MusicPlaylist.getInstance("Party Mix 2023");
        playlist.addSong(newSong);
    }

    public void showPlaylist()
    {
        MusicPlaylist playlist = MusicPlaylist.getInstance("Party Mix 2023");
        playlist.showPlaylist();
    }

}
