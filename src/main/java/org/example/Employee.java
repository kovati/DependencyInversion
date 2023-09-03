package org.example;

public class Employee {
    String employeeName;

    public Employee(String name){
        this.employeeName = name;
    }
    void addEntry(Storage manager){
        manager.save(employeeName);
    }
}
