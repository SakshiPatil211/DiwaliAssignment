package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import java.util.List;
import java.util.*;

public class EmployeeTest {

 private static final EmployeeService service = new EmployeeService();
 private static final Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
     System.out.println("Employee Management System (DAO/Service Demo) ");
     int choice = 0;

     while (choice != 7) {
         displayMenu();
         System.out.print("Enter your choice: ");
         try {
             choice = scanner.nextInt();
             scanner.nextLine(); // Consume newline

             switch (choice) {
                 case 1:
                     addEmployee();
                     break;
                 case 2:
                     removeEmployee();
                     break;
                 case 3:
                     showAllEmployees(service.getAllEmployees(), "Current Employees");
                     break;
                 case 4:
                     showAllEmployees(service.getSortedEmployees(), "Employees Sorted by ID");
                     break;
                 case 5:
                     findEmployeeByName();
                     break;
                 case 6:
                     saveEmployees();
                     break;
                 case 7:
                     quitProgram();
                     break;
                 default:
                     System.out.println("❌ Invalid choice. Please select a number between 1 and 7.");
             }
         } catch (java.util.InputMismatchException e) {
             System.out.println(" Invalid input. Please enter a number.");
             scanner.nextLine(); // Clear the buffer
             choice = 0;
         }
         System.out.println("\n---");
     }
 }

 private static void displayMenu() {
     System.out.println("\n*** MENU ***");
     System.out.println("1. Add Employee to list");
     System.out.println("2. Remove Employee from list");
     System.out.println("3. Show all Employees");
     System.out.println("4. Show all Employees in sorted order (by empID)");
     System.out.println("5. Find a Employee with empName");
     System.out.println("6. Save all Employees into file");
     System.out.println("7. Quit");
 }

 // 1. Add Employee
 private static void addEmployee() {
     System.out.print("Enter Employee ID: ");
     int id = scanner.nextInt();
     scanner.nextLine();
     System.out.print("Enter Employee Name: ");
     String name = scanner.nextLine();
     System.out.print("Enter Employee Role (or leave blank for default 'Staff'): ");
     String role = scanner.nextLine();

     Employee newEmp;
     if (role.trim().isEmpty()) {
         // Uses the 2-argument constructor
         newEmp = new Employee(id, name);
     } else {
         // Uses the 3-argument constructor
         newEmp = new Employee(id, name, role);
     }

     if (service.addEmployee(newEmp)) {
         System.out.println("Employee added successfully: " + newEmp);
     } else {
         System.out.println("Error: Employee with ID " + id + " already exists.");
     }
 }

 // 2. Remove Employee
 private static void removeEmployee() {
     System.out.print("Enter Employee ID to remove: ");
     int id = scanner.nextInt();
     scanner.nextLine();

     if (service.removeEmployee(id)) {
         System.out.println(" Employee with ID " + id + " removed successfully.");
     } else {
         System.out.println("Error: Employee with ID " + id + " not found.");
     }
 }

 // 3 & 4. Show All Employees (and Sorted)
 private static void showAllEmployees(List<Employee> employees, String title) {
     System.out.println("\n--- " + title + " (" + employees.size() + " Total) ---");
     if (employees.isEmpty()) {
         System.out.println("List is empty.");
     } else {
         for (Employee emp : employees) {
             System.out.println(emp);
         }
     }
 }

 // 5. Find a Employee with empName
 private static void findEmployeeByName() {
     System.out.print("Enter Employee Name to search: ");
     String name = scanner.nextLine();

     List<Employee> found = service.findEmployeesByName(name);

     if (found.isEmpty()) {
         System.out.println("No employees found with the name: " + name);
     } else {
         showAllEmployees(found, "Found Employees matching '" + name + "'");
     }
 }

 // 6. Save All Employees
 private static void saveEmployees() {
     if (service.saveAllEmployees()) {
         System.out.println("All employees successfully saved to file.");
     } else {
         System.out.println("Failed to save employees to file.");
     }
 }

 // 7. Quit
 private static void quitProgram() {
     // Optional: Save before quitting
     System.out.print("Do you want to save current data before quitting? (y/n): ");
     String saveChoice = scanner.nextLine().trim().toLowerCase();
     if (saveChoice.equals("y")) {
         saveEmployees();
     }
     System.out.println("Program quitting. Goodbye!");
     scanner.close();
 }
}
