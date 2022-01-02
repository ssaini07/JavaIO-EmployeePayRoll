package com.bridgelabz.EmployeePayRollService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreEmployeeServicePayroll {
    final static String FILE_NAME = "AddressBookText.txt";

    public StoreEmployeeServicePayroll() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        //getListOfContacts();
        File txtFile = new File(FILE_NAME);
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your choice below");
        //int ch;
       // ch = sc.nextInt();

        writeTxtData1(txtFile, getListOfContacts().toString());
        countEntries();
        readTxtData(txtFile);
    }
    //method to write data into the file
    private static void writeTxtData1(File file, String data) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//method to get list of employee
    public static List<EmployeePayroll> getListOfContacts() {
        List<EmployeePayroll> employeePayrolls = new ArrayList<EmployeePayroll>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = sc.next();
        System.out.println("Enter employee id");
        int id = sc.nextInt();
        System.out.println("Enter employee salary");
        double salary = sc.nextDouble();
        employeePayrolls.add(new EmployeePayroll(name, id, salary));
        return employeePayrolls;
    }

    //count the entries
    public static void countEntries() throws IOException {
        FileInputStream fstream = new FileInputStream("AddressBookText.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        int count = 0;

        while ((strLine = br.readLine()) != null) {
            count++;
            System.out.println("Count of employees are: " + count);
        }
    }
//method to print or read the record....
    public static void readTxtData(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(fileReader);
            System.out.println("Reading operation ::");
            System.out.println(sc.nextLine());
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





