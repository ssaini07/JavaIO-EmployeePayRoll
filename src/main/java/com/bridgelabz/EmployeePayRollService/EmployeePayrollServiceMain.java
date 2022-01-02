package com.bridgelabz.EmployeePayRollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollServiceMain {

    List<EmployeePayroll> employeePayrolls = new ArrayList<EmployeePayroll>();

    public EmployeePayrollServiceMain(ArrayList<EmployeePayroll> employeePayrollDataList) {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee payroll service");
        ArrayList<EmployeePayroll> employeePayrollDataList = new ArrayList<>();
        EmployeePayrollServiceMain employeePayrollService =
                new EmployeePayrollServiceMain(employeePayrollDataList);
        Scanner scanner = new Scanner(System.in);
        employeePayrollService.readEmployeePayroll(scanner);
        employeePayrollService.writeEmployeePayroll();

    }

    private void writeEmployeePayroll() {
        System.out.println("Writing employee data to the console: " + employeePayrolls);
    }

    private void readEmployeePayroll(Scanner scanner) {

        System.out.println("Enter employee id");
        int id = scanner.nextInt();
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("Enter employee salary");
        double salary = scanner.nextDouble();
        employeePayrolls.add(new EmployeePayroll(name, id, salary));
    }
}
