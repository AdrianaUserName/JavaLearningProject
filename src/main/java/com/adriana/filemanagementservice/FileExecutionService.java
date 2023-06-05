package com.adriana.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {
        File demoFile = new File("src/main/java/com/adriana/filemanagementservice/test.txt");
        FileManager.createTheFileIfItDoesNotExist(demoFile);
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.printTheFileName(demoFile);
        //   FileManager.printIfTheFileIsDirectory(demoFile);FileManager.deleteTheFileIfExists(demoFile);

        InputFileReaderManager.readDataFromATextFile(demoFile);
        InputFileReaderManager.readDataFromATextFileUsingFileReader(demoFile);
        InputFileReaderManager.readDataFromTextFileUsingBufferedReader(demoFile);

        OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile, "test");
        OutputFileWriterManager.writeDataIntoFileWithBufferedWriter(demoFile, "Empty content");
    }
}
