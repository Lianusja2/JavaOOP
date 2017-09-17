package Lecture3.Text;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class TextRunner {
    public static void main(String[] args) {
        Text text= new Text("This is titel",new Sentence(new Word("test1"), new Word("test2")),  new Sentence(new Word("test3"), new Word("test4")));
        text.appendText(new Sentence(new Word("test5")));
        text.typeTitel();
        text.typeText();
    }

}
