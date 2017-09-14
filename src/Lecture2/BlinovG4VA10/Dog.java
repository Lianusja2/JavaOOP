package Lecture2.BlinovG4VA10;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("Gav Gav");
    }

    public void run(){
        System.out.println("Run");
    }

    public void jump(){
        System.out.println("Jump");
    }

    public void bite(){
        System.out.println("Bite");
    }
}
