package io.zipcoder;

import com.sun.org.apache.xerces.internal.util.DOMInputSource;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DinosaurTest {

    @Test
    public void testMakeNoise(){
        //Given
        Dinosaur dino = new Dinosaur("dino");
        //then
        dino.makeNoise();
    }

    @Test
    public void testSetName(){
        //Given
        Dinosaur dino = new Dinosaur("Dino");
        String expected = "Blue";
        //WHen
        dino.setName(expected);
        //Then
        Assert.assertEquals(expected, dino.getName());
    }

}