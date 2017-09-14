package Lecture2.Book;

import java.time.Year;
import java.util.ArrayList;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Book {

    public Book(Type type, String id, ArrayList<String> authors, String publisher, Year year, int pageNumber, int price) {
        this.type = type;
        this.id = id;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
    }
    private String id;
    private ArrayList<String> authors;
    private String publisher;
    private Year year;
    private int pageNumber;
    private int price;
    private Type type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type{
      SOFT, HARD;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
