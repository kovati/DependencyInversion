package org.examples.example1;

public class Main {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=8CuirrozBdM
        Employee emp1 = new Employee("Feri");
        Employee emp2 = new Employee("Jozsi");
        Employee emp3 = new Employee("Peti");

        DatabaseManager dbManager = new DatabaseManager();
        FileSystemManager fileSystemManager = new FileSystemManager();
        CloudManager cloudManager = new CloudManager();

        emp1.addEntry(dbManager);
        emp2.addEntry(fileSystemManager);
        emp3.addEntry(cloudManager);

    }
}