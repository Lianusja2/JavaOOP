package Lecture6;

import java.util.List;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public class Film {

    private String name;
    private int year;
    private List<String> actorsName;
    private Genre genre;

    public Film(String name, int year, List<String> actorsName, Genre genre) {
        this.name = name;
        this.year = year;
        this.actorsName = actorsName;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", actorsName=" + actorsName +
                ", genere=" + genre +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getActorsName() {
        return actorsName;
    }

    public Genre getGenre() {
        return genre;
    }
}
