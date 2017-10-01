package Lecture7.NamesComparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class Names {
    private List<String> names = new ArrayList<>();

    public Names(List<String> names) {
        this.names.addAll(names);
    }

    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }

    public void sortting(Comparator<String> comparator){
       Collections.sort(names,comparator);
    }

    public void sortting(Comparator<String> comparator1, Comparator<String> comparator2){
        Collections.sort(names, comparator2);
        Collections.sort(names,comparator1);
    }

    public static Comparator<String> alphabeticalOrder(){
    return (String a,String b)->  a.compareTo(b);
    }

    public static Comparator<String> reverseAlphabeticalOrder(){
        return Collections.reverseOrder(alphabeticalOrder());
    }

    public String minName() {
        return Collections.min(names);
    }

    public static Comparator<String> byLength(){
        return (String a,String b)->  Integer.compare(a.length(),b.length());
    }
}
