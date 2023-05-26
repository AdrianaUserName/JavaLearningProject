package com.adriana.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog("Charlie");

        System.out.println("Numele obiectului charlieDog este: " + charlieDog.getName());

        charlieDog.setName("Charlie Vaccined");
        System.out.println("Numele actualizat a lui charlieDog este: " + charlieDog.getName());

        charlieDog.eat();
        AnimalInterface rexDog = new Dog("The dog Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("The dog Zik");
        zikDog.eat();
        zikDog.makeSound();
        zikDog.sleeps();

        Cat kellyCat = new Cat("The cat Kelly");
        kellyCat.eat();
        kellyCat.makeSound();
        kellyCat.sleeps();

        Fox ramboFox = new Fox("The fox Rambo");
        ramboFox.eat();
        ramboFox.makeSound();
        ramboFox.sleeps();
    }
}
