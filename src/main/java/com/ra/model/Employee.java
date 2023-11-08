package com.ra.model;

public class Employee {
    private String employeeCode;
    private String fullName;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeCode, String fullName, int age, double salary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
