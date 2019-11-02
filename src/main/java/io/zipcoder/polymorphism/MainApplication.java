package io.zipcoder.polymorphism;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {

        Boolean turnOn = true;

        while (turnOn) {
            Integer inputValue = Console.getIntegerInput("Hello nice to meet you! How many pets do you have?" +
                    " \n Please enter a number value :)");

            if (inputValue > 0) {
                for (int i = 0; i < inputValue; i++) {
                    String petValue = Console.getStringInput("What type of animal are they?");
                    String nameValue = Console.getStringInput("What are their names?");
                }

            }
            System.out.println("Thank you for telling me about your pets! ");
            turnOn = false;

        }
    }
}