package com.adriana.classesandobjects.autoservicetask;

public class Tool {

double price;
String name;
int weight;
boolean needsElectricity;
boolean needsLicence;
boolean isUsed;
long uniqueCode;

Tool(){
    System.out.println("A fost creat un instrument despre care nu se stie nimic");
}
Tool(long uniqueCodeParam){
    uniqueCode = uniqueCodeParam;
    System.out.println("A fost creat un nou instrument despre care se cunoaste doar codul unic");
}
}
