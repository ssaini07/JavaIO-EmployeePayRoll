package com.bridgelabz.EmployeePayRollService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {

    final static String FILE_NAME = "src\\main\\resources\\IndiaStateCode.csv";

    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        if (file.exists()) {
            System.out.println("Your file is existed");
        } else {
            System.out.println("File is not existed");
        }

        fileDelete();
        createDirectory();
        listFilesAndDirectories();
    }

    //check if file is deleted or not
    public static void fileDelete() throws IOException {

        // create an object of Path
        Path pathOfFile
                = Paths.get("D:\\" + "IndiaStateCode.csv");
        boolean result
                = Files.deleteIfExists(pathOfFile);
        if (result) {
            System.out.println("File is deleted");
        } else {
            System.out.println("File is not deleted");
        }

    }

    //creating a directory
    public static void createDirectory() {
        System.out.println("Enter the path to create a directory");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        System.out.println("Enter the name of a directory: ");
        path = path + scanner.next();
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Sorry could not create specified directory");
        }
    }

    //List Files, Directories as well as Files with Extension
    public static void listFilesAndDirectories() {
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname.
        File f = new File("D:/Programming");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println(pathname);
        }
    }
}


