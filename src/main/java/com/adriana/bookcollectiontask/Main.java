package com.adriana.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1984 = new Book("1984", "George O.");
        Book bookBuyology = new Book("Buyology","Martin L.");
        Book bookArsaDeVie = new Book("Arsa de vie","Alice M.");
        Book bookIon = new Book("Ion" ,"Liviu Rebreanu");

        Library classicLibrary = new Library("Librarius");

        classicLibrary.addBook(bookBuyology,bookArsaDeVie);
        classicLibrary.addBook(bookArsaDeVie,bookIon);
        classicLibrary.addBook(bookBuyology, bookIon);

        classicLibrary.printAllTheBookks();

        System.out.println("Numarul de carti dupa stergere este: " +classicLibrary.returnNumberOfBooks());

        classicLibrary.removeBook(3);
        classicLibrary.removeBook(book1984);

        classicLibrary.removeBook("Buyology");

        Library literaLibrary = new Library("Litera");

        literaLibrary.addBook(bookIon,bookArsaDeVie);
        literaLibrary.addBook(bookIon,book1984);
        System.out.println(literaLibrary.returnNumberOfBooks());

        Map<String,Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("str. Arborilor 22", classicLibrary);
        librariesNetwork.put("Str. Vieru 14" , literaLibrary);

        librariesNetwork.get("Str. Vieru 14").addBook(bookIon,bookArsaDeVie);
        librariesNetwork.get("str. Arborilor 22").printAllTheBookks();

        librariesNetwork.get("str. Arborilor 22").addAnotherListOfBooksIntoTheLibraryList(literaLibrary.getBookList());


    }
}
