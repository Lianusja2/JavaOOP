package Lecture2.Book;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class BooksRunner {

    public static void main(String[] args) {

        Book b1 = new Book(Book.Type.HARD, "1AEC23", new ArrayList<String>(Arrays.asList("Anton", "Inna", "Slava")), "TestPublisher", Year.of(2000), 123, 67);
        Book b2 = new Book(Book.Type.SOFT, "31AEC23", new ArrayList<String>(Arrays.asList("Inna", "Slava")), "TestPublisher", Year.of(2002), 123, 67);
        Book b3 = new Book(Book.Type.HARD, "GAEC23", new ArrayList<String>(Arrays.asList("Slava")), "Test2", Year.of(2003), 123, 67);
        Book b4 = new Book(Book.Type.HARD, "1YEC23", new ArrayList<String>(Arrays.asList("Pup")), "Test3", Year.of(1990), 123, 67);
        Books books = new Books();
        books.addBook(b1);
        books.addBook(b2);
        books.addBook(b3);
        books.addBook(b4);
        System.out.println(books.searchAfterYear(Year.of(2001)));
        System.out.println(books.searchByPublisher("TestPublisher"));
        System.out.println(books.searchByAuthor("Pup"));
    }
}
