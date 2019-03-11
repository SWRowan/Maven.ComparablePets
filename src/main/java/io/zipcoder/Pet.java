package io.zipcoder;

public abstract class Pet {
    IOConsole console = new IOConsole();
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void makeNoise(){
        console.println("PetNoise");
    }




}
