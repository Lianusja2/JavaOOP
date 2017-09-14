package Lecture2.BlinovG4VA10;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void getName() {
       System.out.println(name);
    }


}
