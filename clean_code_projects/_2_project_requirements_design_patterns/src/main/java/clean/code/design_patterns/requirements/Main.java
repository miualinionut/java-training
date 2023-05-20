package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {

        //Singleton pattern + Builder pattern

        User Damian = new User("damiano992");
        User Angela = new User("ur_angel");
        User Robin = new User("epicSidekick_12");

        Damian.addSong(new Song.Builder("Torna a casa")
                .setArtist("Maneskin")
                .setDuration("3:51")
                .setGenre("ROCK")
                .setUser(Damian.getUserName())
                .build());

        Damian.showPlaylist();

        Angela.showPlaylist();

        Robin.addSong(new Song.Builder("Summertime Sadness")
                .setArtist("Lana Del Rey")
                .setUser(Robin.getUserName())
                .setGenre("POP")
                .setDuration("4:25")
                .build());

        Angela.showPlaylist();
    }
}
