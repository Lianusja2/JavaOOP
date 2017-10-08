package Lecture9;

import Lecture7.PersonFilteringSorting.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by inna.pshenychna on 10/8/2017.
 */
public class AgeCategoriesForPeople {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<Person>();
        peopleList.add(new Person("Nusja", 16));
        peopleList.add(new Person("Tessa", 67));
        peopleList.add(new Person("Anna", 19));
        peopleList.add(new Person("Addam", 74));
        peopleList.add(new Person("Tania", 17));
        peopleList.add(new Person("Anna", 18));
        peopleList.add(new Person("Mary", 15));

        Map<Integer, Person> peopleMap = new TreeMap<Integer, Person>();
        for (Person person : peopleList) {
            peopleMap.put(person.getAge(), person);

        }
        getAgeBetwee(peopleMap, 12,17);
        getYoungestOlderAge(peopleMap, 18);
        getOldestYoungerAge(peopleMap, 18);
    }

    public static void getAgeBetwee(Map<Integer, Person> peopleMap, Integer min, Integer max) {
        Set<Integer> peopleSet = peopleMap.keySet().stream().filter(age -> age >= min && age <= max).collect(Collectors.toSet());
        for (Integer age : peopleSet) {
            System.out.println(peopleMap.get(age));
        }
    }

    public static void getYoungestOlderAge(Map<Integer, Person> peopleMap, Integer borderAge) {
        Integer ageNeeded =  peopleMap.keySet().stream().filter(age -> age > borderAge).min((a,b)-> Integer.compare(a,b)).get();
        System.out.println( "The youngest above: "+ borderAge+peopleMap.get(ageNeeded));

    }

    public static void getOldestYoungerAge(Map<Integer, Person> peopleMap, Integer borderAge) {
        Integer ageNeeded =  peopleMap.keySet().stream().filter(age -> age < borderAge).max((a,b)-> Integer.compare(a,b)).get();
        System.out.println( "The oldest below: "+ borderAge+peopleMap.get(ageNeeded));

    }



}
