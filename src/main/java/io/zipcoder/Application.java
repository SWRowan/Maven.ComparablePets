package io.zipcoder;


import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;

import java.util.ArrayList;
import java.util.List;

public class Application {
    IOConsole display = new IOConsole();

    public Integer numberOfPetsPrompt(){
        return display.getIntegerInput("How many pets do you have?");
    }

    public ArrayList<Pet> getPetList(Integer numberOfPets){
        ArrayList<Pet> petList = new ArrayList<Pet>();

        for (int i = 0; i < numberOfPets; i++) {
            String type = display.getStringInput("What kind of Pet is it?");
            String name = display.getStringInput("What is your pets name?");
            if(type.equalsIgnoreCase("dog")){
                petList.add(new Dog(name));
            }else if(type.equalsIgnoreCase("cat")){
                petList.add(new Cat(name));
            }else if(type.equalsIgnoreCase("dinosaur")){
                petList.add(new Dinosaur(name));
            }
        }
       return petList;
    }

    public void printPetList(ArrayList<Pet> list){
        for(Pet p : list){
            System.out.println(p.getName());
            p.makeNoise();
        }
    }


    public static void main(String[] args) {
        Application application = new Application();

        Integer num = application.numberOfPetsPrompt();
        ArrayList<Pet> list = application.getPetList(num);
        System.out.println("\n");
        application.printPetList(list);



    }


}
