package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DinosaurTest {

    @Test
    public void speakTest() {

        String expected = "RAWRRR";
        Dinosaur dino = new Dinosaur();

        String actual = dino.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName(){
        Dinosaur dino = new Dinosaur ();
        String expected = "Little Foot";

        String actual = dino.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void testSetName() {

        Dinosaur dino = new Dinosaur();
        String expected = "Little Foot";

        dino.setName(expected);
        String actual = dino.getName();

        Assert.assertEquals(expected, actual);
    }
}
