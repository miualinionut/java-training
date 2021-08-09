package proj2;

public class Book {
    //All final attributes
    private final String isbn; // required
    private final String title; // required
    private final String author;// optional
    private final int pg; // optional
    private final String description;// optional

    public Book(BookBuilder builder) {
        this.isbn= builder.isbn;
        this. title= builder.title;
        this.author = builder.author;
        this.pg = builder.pg;
        this.description = builder.description;
    }
    //All getter, and NO setter to provde immutability
    public String getisbn() {
        return isbn;
    }
    public String gettitle() {
        return title;
    }
    public String getauthor() {
        return author;
    }
    public int getpg() {
        return pg;
    }
    public String getdescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book: "+this.isbn+", "+this.title+", "+this.author+", "+this.pg+", "+this.description;
    }

    public static class BookBuilder
    {
        private final String isbn;
        private final String title;
        private String author;
        private int pg;
        private String description;

        public BookBuilder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }
        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }
        public BookBuilder pg(int pg) {
            this.pg = pg;
            return this;
        }
        public BookBuilder description(String description) {
            this.description = description;
            return this;
        }
        //Return the finally consrcuted Book object
        public Book build() {
            Book book =  new Book(this);
            return book;
        }

    }
}