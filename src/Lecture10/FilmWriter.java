package Lecture10;

import Lecture6.Film;

import java.io.*;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by inna.pshenychna on 10/10/2017.
 */
public class FilmWriter {

    public  void outputFilmIntoFile(Film film, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputFilm(film, writer);
        }
    }

    public  void outputFilmsIntoFile(List<Film> films, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            outputFilms(films, writer);
        }
    }

    private  void outputFilm(Film film, PrintWriter writer) {
        writer.println(convertFilmToCsv(film, ";"));
    }



    private  void outputFilms(List<Film> films, PrintWriter writer) {
        for (Film film : films) {
            outputFilm(film, writer);
        }
    }

   private  String convertFilmToCsv(Film film, String delimiter) {
       StringJoiner joiner = new StringJoiner(delimiter);
       joiner.add(film.getName()).add(film.getGenre().toString()).add(String.valueOf(film.getYear())).add(film.getActorsName().toString());
         return joiner.toString();
   }

   public void outputBinaryFilmsIntoFile(List<Film> films, String fileName) throws IOException {
       try( ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
        objectOutputStream.writeObject(films);}

   }

}
