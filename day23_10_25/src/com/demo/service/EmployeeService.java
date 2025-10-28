package com.demo.service;

//File: src/service/EmployeeService.java


import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import java.util.List;

import com.demo.dao.EmployeeDao;

public class EmployeeService {

 private final EmployeeDao dao;

 public EmployeeService() {
     this.dao = new EmployeeDao();
 }

 // Delegating methods to DAO
 public boolean addEmployee(Employee emp) {
     return dao.addEmployee(emp);
 }

 public boolean removeEmployee(int empID) {
     return dao.removeEmployee(empID);
 }

 public List<Employee> getAllEmployees() {
     return dao.getAllEmployees();
 }

 public List<Employee> getSortedEmployees() {
     return dao.getSortedEmployees();
 }

 public List<Employee> findEmployeesByName(String empName) {
     return dao.findEmployeesByName(empName);
 }

 public boolean saveAllEmployees() {
     return dao.saveEmployeesToFile();
 }
}
