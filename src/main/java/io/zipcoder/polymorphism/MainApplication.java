package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {

        Boolean turnOn = true;



            while (turnOn) {

                Integer inputValue = Console.getIntegerInput("Hello nice to meet you! How many pets do you have?" +
                        " \n Please enter a number value :)");

                List<Pet> petsLog = new ArrayList<Pet>();

                if (inputValue > 0) {
                    for (int i = 0; i < inputValue; i++) {
                        String petValue = Console.getStringInput("What type of animal are they?");
                        String nameValue = Console.getStringInput("What are their names?");
                        switch (petValue){
                            case("Dog"):

                            Dog dog = new Dog(nameValue);
                            petsLog.add(dog);

                                break;

                            case ("Cat"):

                                Cat cat = new Cat(nameValue);
                                petsLog.add(cat);

                                break;

                            case ("Bird"):

                                Bird bird = new Bird(nameValue);
                                petsLog.add(bird);

                                break;

                            default:

                                System.out.println("I didn't know you could have one of those...");

                                break;


                        }


                    }
                    System.out.println("\nYour pets: \n");

                    for (int j = 0 ; j < petsLog.size() ; j++){

                        System.out.println(petsLog.get(j).getName() + " " + petsLog.get(j).speak());

                    }

                    System.out.println(" \n I bet they're all cute!");
                }
                System.out.println("Thank you for telling me about your pets! ");
                turnOn = false;

            }
    }
}