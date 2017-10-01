package Lecture7.PersonFilteringSorting;

import static Lecture7.PersonFilteringSorting.People.ageBetween;
import static Lecture7.PersonFilteringSorting.People.alphabeticalOrder;
import static Lecture7.PersonFilteringSorting.People.byAge;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class PeopleRunner {
    public static void main (String[] args) {
        //Homework 7
        People people = new People();
        people.add(new Person("Ted", 16));
        people.add(new Person("Amy", 16));
        people.add(new Person("Ron", 14));
        people.add(new Person("Peter", 13));
        people.add(new Person("Teddy", 65));
        System.out.println(people);
        people.filter(ageBetween(12, 17)).sort(byAge(), alphabeticalOrder());
        System.out.println(people);


        //Homework 8
        people.add(new Person("", 15));
        people.add(new Person(null, 15));
        System.out.println(people);
        people.cleanUpEmpty();
        System.out.println(people);

    }
}
