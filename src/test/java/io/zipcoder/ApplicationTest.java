package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

@Test

    public void howManyPetsTest(){
    //Given
    Application application = new Application();

    List<Pet> expectedPetList = new ArrayList();
    expectedPetList.add(new Dog("Bobby"));
    expectedPetList.add(new Cat("Jawn"));
    expectedPetList.add(new Dinosaur("Pat"));


    //When

    List<Pet> actualPetsList = application.getPeList();

    //Then
    Assert.assertTrue(expectedPetList.equals(actualPetsList));

}
}
