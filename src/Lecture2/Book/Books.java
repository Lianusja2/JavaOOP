package Lecture2.Book;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Books {

    /*
    Books: ArrayList<Book> books. Позволяет выполнить поиск:
    a)  список книг заданного автора;
    b)  список книг, выпущенных заданным издательством;
    c)  список книг, выпущенных после заданного года.
     */
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> searchByAuthor(String authorName){
        List<Book> searchResult;
        searchResult = books.stream().filter(book -> book.getAuthors().contains(authorName)).collect(Collectors.toList());
        return searchResult;
    }

    public List<Book> searchByPublisher(String publisher){
        List<Book> searchResult;
        searchResult = books.stream().filter(book -> book.getPublisher().equals(publisher)).collect(Collectors.toList());
     return searchResult;
    }

    public List<Book> searchAfterYear(Year year){
        List<Book> searchResult;
        searchResult = books.stream().filter(book -> book.getYear().isAfter(year)).collect(Collectors.toList());
        return searchResult;
    }

}
