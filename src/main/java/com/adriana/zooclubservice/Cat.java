package com.adriana.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats mice");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says meow!");
    }

    @Override
    public void sleeps() {
        System.out.println(getName() + " sleeps 18 h from 24 h");
    }
}
