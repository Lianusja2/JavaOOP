package Lecture3.Text;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class Text {
    private String text="";
    private final String titel;

    public Text(String titel, Sentence... sentences) {
        if (titel.equals("")) {
            throw new IllegalArgumentException("Titel can not be empty");
        } else if (sentences == null) {
            throw new IllegalArgumentException("Text can not be empty. Add sentences");
        } else {
            this.titel = titel;
            for (Sentence sentence : sentences) {
                text += sentence.getSentence() + " ";
            }
        }
    }

    public void appendText(Sentence... sentences) {
        for (Sentence sentence : sentences) {
            text += sentence.getSentence() + " ";
        }
    }

    public void typeTitel() {
        System.out.println(titel);
    }

    public void typeText() {
        System.out.println(text);
    }
}
