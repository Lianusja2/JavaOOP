package Lecture7;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class Range<T extends Number & Comparable<T>> {
    T beginning;
    T end;

    public Range(T beginning, T end) {
        if(end.compareTo(beginning)<0){
            throw new IllegalArgumentException("End can not be lees then ebginning is the range");
        }else {
            this.beginning = beginning;
            this.end = end;
        }
    }


    public T getBegigning() {
        return beginning;
    }

    public T getEnd() {
        return end;
    }
}
