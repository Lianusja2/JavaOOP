package Lecture9;

import Lecture7.PersonFilteringSorting.People;
import Lecture7.PersonFilteringSorting.Person;

import java.util.*;

/**
 * Created by inna.pshenychna on 10/8/2017.
 */
public class UniqueSortedPeople {

    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<Person>();
        peopleList.add(new Person("Nastia", 34));
        peopleList.add(new Person("Tessa", 67));
        peopleList.add(new Person("Anna", 84));
        peopleList.add(new Person("Addam", 74));
        peopleList.add(new Person("Nastia", 78));
        peopleList.add(new Person("Anna", 89));
        peopleList.add(new Person("Mary", 34));

        Set<Person> peopleTreeSet =  new TreeSet<Person>(nameComparator());

        for(Person person: peopleList){
            peopleTreeSet.add(person);
        }

        peopleTreeSet.forEach(person -> System.out.println(person));
    }

    public static Comparator<Person> nameComparator(){
       return (a,b) -> a.getName().compareTo(b.getName());
    }

}
