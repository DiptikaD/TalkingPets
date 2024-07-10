package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(){
        super();
    }
    public Cat(String name){
        setName(name);
    }

    @Override
    public String speak() {
        return "meow";
    }

}
