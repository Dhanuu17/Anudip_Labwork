 package com.example;
import java.util.HashMap;
import java.util.Map;

public class AssociateKeyValue {
    public static void main(String[] args) {
       
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Yash Neharkar");
        employeeMap.put(102, "Dhanshree Shedge");
        employeeMap.put(103, "Keshar Gaikwad");
        employeeMap.put(104, "Rasika Jadhav");

       
        System.out.println("Employee Data:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Emp ID: " + entry.getKey() + ", Emp Name: " + entry.getValue());
        }
        int empId = 103;
        String empName = employeeMap.get(empId);
        System.out.println("Employee Name for ID " + empId + ": " + empName);
        empId = 105;
        empName = "Sanjana Shelar";
        employeeMap.put(empId, empName);
        System.out.println("Updated Employee Data:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Emp ID: " + entry.getKey() + ", Emp Name: " + entry.getValue());
        }
    }
}