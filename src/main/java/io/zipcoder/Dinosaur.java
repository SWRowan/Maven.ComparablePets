package io.zipcoder;

public class Dinosaur extends Pet {


    public Dinosaur(String name) {
        super(name);
    }

    @Override
    public void makeNoise(){
        console.println("RAWR");
    }

}
