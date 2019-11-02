package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet>  {

    private String name;

    public Pet (String name){
        this.name = name;
    }

    public String speak() {
        return "Animal noise";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Pet o) {
        if( name.equals(o.getName()) ){
            String className1 = this.getClass().getSimpleName();
            String className2 = o.getClass().getSimpleName();

            return className1.compareTo(className2);

        }
        return name.compareTo(o.getName());
    }


    }



