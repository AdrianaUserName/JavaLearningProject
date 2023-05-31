package com.adriana.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result);
        System.out.println("The programme is running till the end");

        String stringValue = "Gheorghe";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLenghtWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLenght(stringValue));
        System.out.println(TextManager.getTheTextLenghtIfElse(stringValue2));

        String filePath = "src/main/java/com/adriana/exceptionsservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist , the execution of the programme is not interrupted");
        } finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWitTryAndCatch(filePath);
    }
}
