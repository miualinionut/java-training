package clean.code.design_patterns.requirements;

//builder design pattern
public class Song {
    private String name;
    private String artistName;
    private String duration;
    private String genre;
    private String userName;

    public void listDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Artist: " + artistName);
        System.out.println("Duration: " + duration);
        System.out.println("Genre: " + genre);
        System.out.println("Added by: " + userName);
        System.out.println("---");
    }

    //Song constructor
    private Song(Builder builder)
    {
        this.userName = builder.userName;
        this.artistName = builder.artistName;
        this.duration = builder.duration;
        this.genre = builder.genre;
        this.name = builder.name;
    }

    //builder class
    public static class Builder {
        private String name;
        private String artistName;
        private String duration;
        private String genre;
        private String userName;
        //the song is required to have a name
        //so we use it in the builder constructor
        public Builder(String nameVal)
        {
            this.name = nameVal;
        }

        public Builder setArtist(String artist)
        {
            this.artistName = artist;
            return  this;
        }

        public  Builder setDuration(String dur)
        {
            this.duration = dur;
            return this;
        }

        public  Builder setGenre(String gen)
        {
            this.genre = gen;
            return this;
        }

        public  Builder setUser(String user)
        {
            this.userName = user;
            return this;
        }

        //build the Song
        public Song build()
        {
            return new Song(this);
        }
    }
}
