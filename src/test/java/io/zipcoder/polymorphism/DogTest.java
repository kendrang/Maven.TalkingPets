package io.zipcoder.polymorphism;

import org.junit.Assert;

import static org.junit.Assert.*;

public class DogTest {

    @org.junit.Test
    public void constructorTest() {

        Dog dog = new Dog("Fido");

        String actual = dog.getName();
        String expected = "Fido";

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void speakTest() {

        Dog dog = new Dog("Fido");
        String actual = dog.speak();
        String expected = "Wan wan";

        Assert.assertEquals(expected, actual);
    }
}