package Lecture10;

import Lecture6.Film;
import Lecture6.Genre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by inna.pshenychna on 10/10/2017.
 */
public class FilmIO {

    public static void main(String[] args) {
        String txtFileName = "Films_File_Name";
        String binaryFileName = "Binary_File_Name";
        List<Film> films = new ArrayList<Film>();
        FilmWriter filmWriter = new FilmWriter();

        films.add(new Film("Film 1", 2000, Arrays.asList("Justin", "Megan", "Colin"), Genre.FANTASY));
        films.add(new Film("Film 2", 2004, Arrays.asList("Justin", "Jeff", "Colin"), Genre.DRAMA));
        films.add(new Film("Film 3", 2011, Arrays.asList("Megan", "Jenna"), Genre.FAMILY));
        films.add(new Film("Film 4", 1999, Arrays.asList("Justin", "Betty", "Jared"), Genre.COMEDY));
        films.add(new Film("Film 5", 2017, Arrays.asList("Jared", "Tess", "Colin"), Genre.FANTASY));
        films.add(new Film("Film 6", 2015, Arrays.asList("Ted", "Mira", "Tony"), Genre.COMEDY));

        try {
            filmWriter.outputFilmsIntoFile(films, txtFileName);
            filmWriter.outputBinaryFilmsIntoFile(films, binaryFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FilmReader filmReader = new FilmReader();
        List<Film> filmsRead;
        List<Film> filmsReadBinary;
        try {
            filmsRead = filmReader.readFilmsFromFile(txtFileName);
            filmsRead.forEach(film -> System.out.println(film));
            filmsReadBinary = filmReader.readBinaryFilmsFromFile(binaryFileName);
            filmsReadBinary.forEach(film -> System.out.println(film));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
