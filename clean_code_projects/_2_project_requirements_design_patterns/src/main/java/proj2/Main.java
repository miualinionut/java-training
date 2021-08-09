package proj2;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.BookBuilder("978-973-136-393-6", "Fratii Karamazov")
                .pg(394)
                .author("Fedor Dostoievski")
                .description("Frații Karamazov este ultimul roman al scriitorului rus Fiodor Dostoievski, " +
                        " Fiind considerat o operă literară de nivel mondial")
                .build();

        System.out.println(book1);

        Book book2 = new Book.BookBuilder("978-973-136-323-9", "Indemn la simplitate")
                .author("Ernest Bernea")
                //no description
                //no pg
                .build();

        System.out.println(book2);
    }

}