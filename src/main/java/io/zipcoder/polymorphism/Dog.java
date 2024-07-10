package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(){
        super();
    }
    public Dog(String name){
        setName(name);
    }

    @Override
    public String speak() {
        return "bark";
    }
}
