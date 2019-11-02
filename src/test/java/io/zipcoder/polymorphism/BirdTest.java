package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @org.junit.Test
    public void constructorTest() {

        Bird birb = new Bird("Tiki");

        String actual = birb.getName();
        String expected = "Tiki";

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void speakTest() {

        Bird birb = new Bird("Tiki");
        String actual = birb.speak();
        String expected = "chirp chirp";

        Assert.assertEquals(expected, actual);
    }
}