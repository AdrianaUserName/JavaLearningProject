package com.adriana.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static void createTheFileIfItDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exists");
        } else {
            System.out.println("The file does not exist , it has to be create");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception:" + e.getMessage());
            }
        }
    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else System.out.println("The file is not present");

    }

    public static void printTheFileName(File file) {
        System.out.println("The file name is:" + file.getName());
    }

    public static void printTheFileAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsoluteFile());
    }

    public static void printIfTheFileIsDirectory(File inputFile) {
        System.out.println("The file is a directory: " + inputFile.isDirectory());
    }

    public static void deleteTheFileIfExists(File inputFile) {
        if (inputFile.exists()) {
            if (inputFile.delete()) {
                System.out.println("The file was deleted");
            } else {
                System.out.println("The file exists, but was not deleted");
            }
        } else {
            System.out.println("The file does not exist");
        }
    }
}
