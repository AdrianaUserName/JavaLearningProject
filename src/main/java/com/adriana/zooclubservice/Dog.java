package com.adriana.zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName() + " eats pidigri");
    }

    public void makeSound() {
        System.out.println(getName() + " make sound ham ham!");

    }

    @Override
    public void sleeps() {
        System.out.println(getName() + " sleeps 10 h from 24 h");
    }

}
