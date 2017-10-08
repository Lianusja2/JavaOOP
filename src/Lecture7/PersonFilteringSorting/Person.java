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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }


}
