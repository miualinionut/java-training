package clean.code.design_patterns.requirements.Iterator.src;

public class RadioStation {

    public static void main(String[] args){

        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DiscJockey album = new DiscJockey(songs70s, songs80s, songs90s);

        // madMike.showTheSongs();

        album.showTheSongs();

    }

}