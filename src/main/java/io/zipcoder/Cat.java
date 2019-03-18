package io.zipcoder;

import java.util.Comparator;

public class Cat extends Pet implements Comparator {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise(){
        console.println("Meow");
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}
