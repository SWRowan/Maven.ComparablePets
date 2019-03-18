package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void testMakeNoise() {
        //Given
        Dog dog = new Dog("Dog");
        //Then
        dog.makeNoise();
    }

    @Test
    public void testSetName(){
        //Given
        Dog dog = new Dog("Dog");
        String expected = "God";
        //When
        dog.setName(expected);
        //Then
        Assert.assertEquals(expected, dog.getName());
    }
}

