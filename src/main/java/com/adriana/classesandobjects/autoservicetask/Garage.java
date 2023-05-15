package com.adriana.classesandobjects.autoservicetask;

public class Garage {

    String address;
    String name;
    boolean hasComputerDiagnostic;
    int carCapacity;
    int numberId;
    String schedule;

    Garage(String adresaDataLaCreare){
        this.address= adresaDataLaCreare;
        System.out.println("A fost creat un garaj");
    }

    Garage(int carCapacity){
        this.carCapacity = carCapacity;
    }
}
