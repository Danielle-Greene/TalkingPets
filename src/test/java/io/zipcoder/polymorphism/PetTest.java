package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void PetInheritenceTest() {


    Pet cat = new Cat();


    Assert.assertTrue(cat instanceof Pet);

}

}