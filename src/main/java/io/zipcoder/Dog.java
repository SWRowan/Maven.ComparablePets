package io.zipcoder;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeNoise(){
        console.println("Woof!");
    }
}
