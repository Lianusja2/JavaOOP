package Lecture6;

import java.util.Arrays;

/**
 * Created by inna.pshenychna on 9/24/2017.
 */
public class FilmRunner {

    public static void main(String[] args) {
        Films films = new Films();
        films.add(new Film ("Film 1", 2000, Arrays.asList("Justin", "Megan", "Colin") ,Genre.FANTASY));
        films.add(new Film ("Film 2", 2004, Arrays.asList("Justin", "Jeff", "Colin") ,Genre.DRAMA));
        films.add(new Film ("Film 3", 2011, Arrays.asList("Megan", "Jenna") ,Genre.FAMILY));
        films.add(new Film ("Film 4", 1999, Arrays.asList("Justin", "Betty", "Jared") ,Genre.COMEDY));
        films.add(new Film ("Film 5", 2017, Arrays.asList("Jared", "Tess", "Colin") ,Genre.FANTASY));
        films.add(new Film ("Film 6", 2015, Arrays.asList("Ted", "Mira", "Tony") ,Genre.COMEDY));

        System.out.println(films.getFilmsByGenre(Genre.COMEDY));
        System.out.println(films.getFilmsWhereYearBetween(1998,2005));
        System.out.println(films.getFilmsByActors("Justin", "Tess"));
    }

}
