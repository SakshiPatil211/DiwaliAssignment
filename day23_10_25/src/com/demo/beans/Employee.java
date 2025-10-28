// File: src/beans/Employee.java

package com.demo.beans;

//import java.util.*;

public class Employee implements Comparable<Employee> {

    // Member variables
    private String empName;
    private int empID;
    private String empRole;

    // --- Overloaded Constructors ---

    // 1. No arguments constructor
    public Employee() {
        this("No Name", 0, "Unassigned");
    }

    // 2. Constructor that accepts empId and empName (empRole is hardcoded)
    public Employee(int empID, String empName) {
        this(empID, empName, "Staff"); // Hardcoded empRole
    }

    // 3. Constructor that accepts empID, empName and empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // --- Getters and Setters ---
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    // --- Other methods of own choice ---

    // Example method: promotes the employee to a new role
    public void promote(String newRole) {
        System.out.println(this.empName + " (ID: " + this.empID + ") promoted from " + this.empRole + " to " + newRole);
        this.empRole = newRole;
    }

    // --- Overrides ---

    // Override toString() for clear output
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }

    // Override equals and hashCode for proper collection usage (Optional but good practice)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID; // Assuming empID is unique
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID);
    }

    // Implements Comparable to sort by empID (required for Option 4)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empID, other.empID);
    }
}