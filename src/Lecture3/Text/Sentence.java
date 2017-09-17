package Lecture3.Text;

/**
 * Created by inna.pshenychna on 9/17/2017.
 */
public class Sentence {


    private String sentence;

    public Sentence(Word ...words){
        if(words==null){
            throw new IllegalStateException("No words are added.");
        }else {
            StringBuilder builder = new StringBuilder();
            for (Word word : words) {
                builder.append(word).append(" ");
            }
            sentence = builder.replace(builder.length()-1,builder.length()-1,".").toString();
        }
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
