package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        if( o1.getClass().equals(o2.getClass())){
            String Name1 = o1.getName();
            String Name2 = o2.getName();

            return Name1.compareTo(Name2);

        }
        return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
    }
}
