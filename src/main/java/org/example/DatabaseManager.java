package org.example;

public class DatabaseManager implements Storage{
    public void save(String name) {
        System.out.println("Elmentettem " + name + "-t a DB-be");
    }
}
