package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.AsyncBoxView;
import java.util.HashMap;

public class MainApplicationTest {
@Test
    public void testMe(){}

    @Test
    public void testChickenClass() {
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Chicken);
    }

    @Test
    public void testChickenPetSuper(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Pet);
    }
    public void testChickenSpeak(){
    Chicken chicken = new Chicken();
    String expected = "bok";
    Assert.assertEquals(expected, chicken.speak());
    }
    public void testChickenName(){
    Chicken chicken = new Chicken();
    String expected = "chook";
    Assert.assertEquals(expected,chicken.speak());
    }

    @Test
    public void testDogClass(){
    Dog dog = new Dog();
    Assert.assertTrue(dog instanceof Dog);
    }

    @Test
    public void testDogspeak(){
    Dog dog = new Dog();
    String expected = "bark";
    Assert.assertEquals(expected, dog.speak());
    }
    @Test
    public void testDogName() {
    Dog dog = new Dog();
    String expected = "stinker";
        dog.setName("stinker");
    Assert.assertEquals(expected, dog.getName());
    }
    @Test
    public void testCatClass(){
    Cat cat = new Cat("cat");
    Assert.assertTrue(cat instanceof Cat);
}
    @Test
    public void testCatSpeak(){
    Cat cat = new Cat();
    Assert.assertEquals("meow", cat.speak());
    }
    @Test
    public void testCatName(){
    Cat cat = new Cat("monster");
//    cat.setName("monster");
    Assert.assertEquals("monster", cat.getName());
    }

}

//You must support at least three types of pets.
//Dog must be one of the types you support.

//Cat must be one of the types you support.
//The Pet class must have a speak method that each subclass overrides.
//The Pet class must have a name field with setters and getters.


