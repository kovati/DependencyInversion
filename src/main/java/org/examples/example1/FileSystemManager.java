package org.examples.example1;

public class FileSystemManager implements Storage{
    public void save(String name) {
        System.out.println("Elmentettem " + name + "-t a filesystem-be");
    }
}
