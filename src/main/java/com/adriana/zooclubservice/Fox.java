package com.adriana.zooclubservice;

public class Fox extends Animal implements AnimalInterface {

    public Fox(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats meat");
    }

    public void makeSound() {
        System.out.println(getName() + " says pss pss!");
    }

    public void sleeps() {
        System.out.println(getName() + " sleeps 12 h from 24 h");
    }
}
