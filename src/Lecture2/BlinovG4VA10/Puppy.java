package Lecture2.BlinovG4VA10;

/**
 * Created by inna.pshenychna on 9/14/2017.
 */
public class Puppy extends Dog {


    public Puppy(String name) {
        super(name);
    }

    @Override
    public void bark(){
        System.out.println("Vuf Vuf");
    }

    @Override
    public void bite(){
        System.out.println("I am to small to bite");
    }
}
