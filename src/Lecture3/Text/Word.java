package Lecture3.Text;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class Word {
    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return  word;
    }
}
