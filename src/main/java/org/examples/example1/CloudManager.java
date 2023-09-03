package org.examples.example1;

public class CloudManager implements Storage {

    @Override
    public void save(String name) {
        System.out.println("Elmentettem " + name + "-t a felhobe");
    }
}
