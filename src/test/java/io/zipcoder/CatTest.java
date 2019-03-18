package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void testConstructor(){
        //Given
        Cat cat = new Cat("cat");
        //then
        Assert.assertTrue(cat instanceof Cat);
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public  void testMakeNoise(){
        //Given
        Cat cat = new Cat("cat");
        //then
        cat.makeNoise();
    }

    @Test
    public void testSetName(){
        //Given
        Cat cat = new Cat("cat");
        String expected = "Cece";
        //when
        cat.setName(expected);
        //Then
        Assert.assertEquals(expected, cat.getName());
    }

}