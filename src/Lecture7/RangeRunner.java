package Lecture7;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class RangeRunner {

    public static void main(String[] args) {
        Range<Long> longRange = new Range<Long>(12378910L, 12345678910L);
        System.out.println(longRange.getEnd());
        Range<Integer> intRange = new Range<Integer>(-7, 67);
        System.out.println(intRange.getEnd());

    }
}
