package Lecture7.NamesComparing;

import java.util.*;

import static Lecture7.NamesComparing.Names.alphabeticalOrder;
import static Lecture7.NamesComparing.Names.byLength;
import static Lecture7.NamesComparing.Names.reverseAlphabeticalOrder;


/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class NamesRunner {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tommy","Any", "Tony", "Ken","Antony", "Tod", "Anabelle", "Mary" );
        Names names = new Names(list);
        System.out.println(names);
        names.sortting(reverseAlphabeticalOrder());
        System.out.println("Reversed: " + names);
        names.sortting(alphabeticalOrder());
        System.out.println("Alphabetical: " + names);
        System.out.println("Min name: " +names.minName());
        names.sortting(byLength());
        System.out.println("By Length: " + names);
        names.sortting(byLength(), reverseAlphabeticalOrder());
        System.out.println("By Length and reversed: " + names);
    }

}


