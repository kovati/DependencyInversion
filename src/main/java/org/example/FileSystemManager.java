package org.example;

public class FileSystemManager implements Storage{
    public void save(String name) {
        System.out.println("Elmentettem " + name + "-t a filesystem-be");
    }
}
