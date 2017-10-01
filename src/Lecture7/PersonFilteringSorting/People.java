package Lecture7.PersonFilteringSorting;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class People {

    private List<Person> people;

    public People() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public People filter(Predicate<Person> predicate) {
        this.people = people.stream().filter(predicate).collect(Collectors.toList());
        return this;
    }

    public static Predicate<Person> ageBetween(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Beginning can not be more then end");
        } else {
            return person -> (person.getAge() >= start && person.getAge() <= end);
        }
    }

    public void sort(Comparator<Person> comparator1, Comparator<Person> comparator2){
        Collections.sort(people, comparator2);
        Collections.sort(people,comparator1);
    }

    public static Comparator<Person> alphabeticalOrder(){
        return (a,b)->  a.getName().compareTo(b.getName());
    }

    public static Comparator<Person> byAge(){
        return (a,b)->  Integer.compare(a.getAge(),b.getAge());
    }

    @Override
    public String toString() {
        return "People{" +
                "people=" + people +
                '}';
    }

    public void cleanUpEmpty(){
      for (Iterator<Person> iterator = people.iterator(); iterator.hasNext();) {
            Person person  = iterator.next();
            if(person.getName()== null){
                iterator.remove();
            }
        }
        for (Iterator<Person> iterator = people.iterator(); iterator.hasNext();) {
            Person person  = iterator.next();
            if(person.getName().isEmpty()){
                iterator.remove();
            }
        }

    }
}
