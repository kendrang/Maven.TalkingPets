package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @org.junit.Test
    public void constructorTest() {

        Cat cat = new Cat("Fido");

        String actual = cat.getName();
        String expected = "Fido";

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void speakTest() {

        Cat cat = new Cat("Fido");
        String actual = cat.speak();
        String expected = "Meow!";

        Assert.assertEquals(expected, actual);
    }
}