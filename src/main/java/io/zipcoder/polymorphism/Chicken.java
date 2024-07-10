package io.zipcoder.polymorphism;

public class Chicken extends Pet{

    public Chicken(){
        super();
    }
    public Chicken(String name){
    setName(name);
    }

    @Override
    public String speak() {
        return "bok";
    }
}
