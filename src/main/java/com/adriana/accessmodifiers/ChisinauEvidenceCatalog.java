package com.adriana.accessmodifiers;

import com.adriana.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person andreiBuzu = new Person(346475336);
        andreiBuzu.address = "Alexandru cel Bun 185";
        andreiBuzu.gender = "Masculin";
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(74563765, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person vasileBuhnici = new Person(235467856, "Vasile Buhnici", false, 23);
        vasileBuhnici.gender = "Masculin";
        vasileBuhnici.address = "Strada Avram Iancu 10";
        System.out.println(vasileBuhnici.toString());
        Person.printNumberOfPeople();

        Person elenaProfir = new Person(745228765, "Elena Profir", false, 44);
        elenaProfir.gender = "Feminin";
        elenaProfir.address = "Mitropolitul Bodoni 55";
        System.out.println(elenaProfir.toString());
        Person.printNumberOfPeople();
    }
}
