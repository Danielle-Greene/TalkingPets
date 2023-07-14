package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {

        String expected = "Woof Woof";
        Dog d = new Dog();

        String actual = d.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName(){
        Dog d = new Dog ();
        String expected = "Rover";

        String actual = d.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testSetName() {

        Dog d = new Dog();
        String expected = "Rover";

        d.setName(expected);
        String actual = d.getName();

        Assert.assertEquals(expected, actual);
    }

}

