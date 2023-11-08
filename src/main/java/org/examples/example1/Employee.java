package org.examples.example1;

public class Employee {
    String employeeName;

    public Employee(String name){
        this.employeeName = name;
    }

    // serti a DIP-et:
    //void addEntry(FileSystemManager manager){
    //    manager.save(employeeName);
    //}
    void addEntry(Storage manager){
        manager.save(employeeName);
    }
}
