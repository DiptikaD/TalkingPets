package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {

    public static void main(String[] args) {

        Chicken chicken = new Chicken("chook");
        Cat cat = new Cat("stinky");
        Dog dog = new Dog("mean face");

        System.out.println();
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(chicken);
        petList.add(cat);
        petList.add(dog);

        for (Pet pet : petList){
            System.out.println(pet.speak() + " said " + pet.getName());
        }


    }

}
