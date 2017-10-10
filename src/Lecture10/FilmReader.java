package Lecture10;

import Lecture6.Film;
import Lecture6.Genre;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inna.pshenychna on 10/10/2017.
 */
public class FilmReader {

    public Film readFilmFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilm(reader);
        }
    }

    private Film readFilm(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseFilmFromCsv(line);
    }

    public List<Film> readFilmsFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readFilms(reader);
        }
    }

    public List<Film> readFilms(BufferedReader reader) throws IOException {
        List<Film> Films = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Film Film = parseFilmFromCsv(line);
            if (Film != null) {
                Films.add(Film);
            }
        }
        return Films;
    }

    private Film parseFilmFromCsv(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        String[] tokens = s.split(";");

        String name = tokens[0];
        int year = Integer.parseInt(tokens[2]);
        Genre genre = null;
        for (Genre ganreItem : Genre.values()) {
            if (ganreItem.toString().equals(tokens[1])) {
                genre = ganreItem;
            }
        }
        List<String> actorsName = new ArrayList<>();
        String[] tokens2 = tokens[3].replace("[", "").replace("]", "").split(",");
        for (String actor : tokens2) {
            actorsName.add(actor);
        }
        return new Film(name, year, actorsName, genre);
    }

    public List<Film> readBinaryFilmsFromFile(String fileName) throws IOException, ClassNotFoundException {
        try(ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Film>) objectInput.readObject();
        }

    }
}
