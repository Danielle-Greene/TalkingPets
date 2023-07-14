package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {


    @Test
    public void speakTest() {

        String expected = "Meow";
        Cat c = new Cat();

        String actual = c.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName(){
        Cat c = new Cat ();
        String expected = "Tiger";

        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testSetName() {

        Cat c = new Cat();
        String expected = "Fluffy";

        c.setName(expected);
        String actual = c.getName();

        Assert.assertEquals(expected, actual);
    }

}