package com.demo.dao;

//File: src/dao/EmployeeDAO.java


import beans.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao {

 // The data store: an ArrayList of Employee objects
 private List<Employee> employeeList;
 private static final String FILE_NAME = "employees.txt"; // Serialization file name

 public EmployeeDao() {
     // Initialize the list and attempt to load data from file on startup
     employeeList = loadEmployeesFromFile();
 }

 // 1. Add Employee
 public boolean addEmployee(Employee emp) {
     if (employeeList.contains(emp)) {
         return false; // Employee with this ID already exists
     }
     return employeeList.add(emp);
 }

 // 2. Remove Employee
 public boolean removeEmployee(int empID) {
     return employeeList.removeIf(e -> e.getEmpID() == empID);
 }

 // 3. Show all Employee (returns a copy to prevent external modification)
 public List<Employee> getAllEmployees() {
     return new ArrayList<>(employeeList);
 }

 // 4. Show all Employee in sorted order (sort on the basis of empID)
 public List<Employee> getSortedEmployees() {
     List<Employee> sortedList = new ArrayList<>(employeeList);
     // Uses the compareTo method implemented in the Employee class
     Collections.sort(sortedList);
     return sortedList;
 }

 // 5. Find a Employee with empName
 public List<Employee> findEmployeesByName(String empName) {
     List<Employee> foundList = new ArrayList<>();
     for (Employee emp : employeeList) {
         if (emp.getEmpName().equalsIgnoreCase(empName)) {
             foundList.add(emp);
         }
     }
     return foundList;
 }

 // 6. Save all Employees into file (using Serialization)
 public boolean saveEmployeesToFile() {
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
         oos.writeObject(employeeList);
         return true;
     } catch (IOException e) {
         System.err.println("Error saving employees to file: " + e.getMessage());
         return false;
     }
 }

 // Helper method to load employees from file on startup
 @SuppressWarnings("unchecked")
 private List<Employee> loadEmployeesFromFile() {
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
         System.out.println("Loading employee data from " + FILE_NAME + "...");
         return (List<Employee>) ois.readObject();
     } catch (FileNotFoundException e) {
         System.out.println("No existing file found. Starting with an empty list.");
         return new ArrayList<>();
     } catch (IOException | ClassNotFoundException e) {
         System.err.println("Error loading employees from file: " + e.getMessage());
         return new ArrayList<>();
     }
 }
}
