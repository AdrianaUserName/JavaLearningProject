package com.adriana.classesandobjects.autoservicetask;

public class Car {


    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;
    int yearOfProduction;
    String gearType;
    String fuelType;
    double carPrice;

    Car(String makeParametruDeIntrare , String modelFormalParameter, int yearOfProduction, String fuelType)
    {make = makeParametruDeIntrare;
    this.model = modelFormalParameter;
    this.fuelType = fuelType;
    this.yearOfProduction = yearOfProduction;
        System.out.println("In urma executiei acestui constructor 4 parametri se creeaza un nou obiect despre care nu cunoastem price,gearType, plateNumber, kmWhenEnteredTheService,color,");
    }

    Car(String make , String model){
        this.make = make;
        this.model = model;
        System.out.println("A fost creata o masina despre care cunoastem doar marca si modelul");
    }
}

