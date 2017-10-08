package Lecture9;

import java.util.*;

/**
 * Created by inna.pshenychna on 10/8/2017.
 */
public class NumbersCounter {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2, 4, 4, 6, 6, 6, 7, 7, 9);
               Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : intList) {
            if (map.containsKey(number))
                map.put(number, map.get(number) + 1);
            else map.put(number, 1);
        }
        for (Integer number : map.keySet()) {
            System.out.println("Key: " + number + " Value: " + map.get(number));
        }
    }
}
