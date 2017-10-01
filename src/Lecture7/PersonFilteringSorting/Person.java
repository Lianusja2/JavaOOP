package Lecture7.PersonFilteringSorting;

/**
 * Created by inna.pshenychna on 10/1/2017.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age can not be less or equal to zero");
        }else {
            this.name = name;
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
