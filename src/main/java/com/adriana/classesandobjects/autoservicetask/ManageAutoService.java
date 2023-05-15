package com.adriana.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage niponAuto = new Garage("Calea Orheiului 21");
        niponAuto.carCapacity = 120;
        niponAuto.schedule= "Luni-Vineri";
        niponAuto.hasComputerDiagnostic = true;
        niponAuto.numberId = 119234;

        System.out.println("Garajul Nipon Auto are urmatoarele proprietati: Adresa: " + niponAuto.address +
                ", Capacitatea de masini: " +niponAuto.carCapacity + ", Programul de lucru:" + niponAuto.schedule +
                ",Diagnostic computerizat:" +niponAuto.hasComputerDiagnostic + ",Numar de ID:"+ niponAuto.numberId);

        Garage avalonMd = new Garage("Studentilor 81");
        avalonMd.carCapacity = 35;
        avalonMd.schedule = "Lu,Ma,Mi,Jo,Vi,Si";
        avalonMd.hasComputerDiagnostic = false;
        avalonMd.numberId = 103344;

        System.out.println("Garajul  Avalon are urmatoarele proprietati: Adresa:" +avalonMd.address +
                ",Capacitatea de masini:" + avalonMd.carCapacity + ", Programul de lucru:" + avalonMd.schedule +
                ", Diagnostic computerizat: " + avalonMd.hasComputerDiagnostic + ",Numar de ID:" + avalonMd.numberId);

        Garage toyotaCenter = new Garage(290);
        toyotaCenter.address = "Alba Iulia 110";
        toyotaCenter.schedule= "Luni-Vineri";
        toyotaCenter.hasComputerDiagnostic = true;
        toyotaCenter.numberId = 122342;

        System.out.println("Toyota Center are urmatoarele proprietati: Adresa:" + toyotaCenter.address +
                ",Capacitatea de masini:" + toyotaCenter.carCapacity + ",Programul de lucru:" + toyotaCenter.schedule +
                ",Diagnostic computerizat:" +toyotaCenter.hasComputerDiagnostic +",Numar de ID:" + toyotaCenter.numberId);

        Car masinaLuiSergiu = new Car("Lexus", "NX" ,2015,"Diesel");
        masinaLuiSergiu.color = "blue";
        masinaLuiSergiu.carPrice = 26000;
        masinaLuiSergiu.gearType = "Automatic";

        System.out.println("Masina lui Sergiu are urmatoarele proprietati: Marca:" + masinaLuiSergiu.make +
                ",Modelul: "+ masinaLuiSergiu.model + ",Anul de productie: " + masinaLuiSergiu.yearOfProduction +
                ",tipul de combustibil:"  + masinaLuiSergiu.fuelType + ",Culoarea:" + masinaLuiSergiu.color +
                ",Pretul:"+ masinaLuiSergiu.carPrice + ",Tipul de cutie de viteze:" + masinaLuiSergiu.gearType);


        Tool elevatorTool = new Tool(239263372);
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatorTool are urmatoarele proprietati: Cod Unic:" +elevatorTool.uniqueCode +
                ",este un instrument utilizat:" + elevatorTool.isUsed + ",are nevoie de electricitate:" +elevatorTool.needsElectricity);

        Worker lucratorulMarius= new Worker();
        lucratorulMarius.name ="Marius";
        lucratorulMarius.age = 28;
        lucratorulMarius.isExperienced= true;

        System.out.println("Lucratorul Marius are urmatoarele proprietati: Nume: "+ lucratorulMarius.name + ",Varsta:" + lucratorulMarius.age + ",Are experienta in domeniu:" + lucratorulMarius.isExperienced);

    }
}
