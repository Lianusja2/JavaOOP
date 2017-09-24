package Lecture6;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public class Films {
    private List<Film> films = new ArrayList<Film>();

    public void add(Film film) {
        films.add(film);
    }

    public List<Film> getFilmsByGenre(Genre genre) {
        return films.stream().filter(film -> film.getGenre().equals(genre)).collect(Collectors.toList());
    }

    public List<Film> getFilmsWhereYearBetween(int from, int till) {
        if (till < from) {
            throw new IllegalArgumentException(" End year can not be less then Start year");
        } else {
            return films.stream().filter(film -> (film.getYear() >= from) && (film.getYear() <= till)).collect(Collectors.toList());
        }
    }

    public List<Film> getFilmsByActors(String... actorsName) {
        List<Film> filmsFiltered = new ArrayList<>();
        for (String actor : actorsName) {
            filmsFiltered.addAll(films.stream().filter(film -> film.getActorsName().contains(actor)).collect(Collectors.toList()));
        }
        return filmsFiltered;
    }
}
