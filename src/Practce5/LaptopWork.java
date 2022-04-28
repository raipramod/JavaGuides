package Practce5;

//Write a java program to create a class Laptop with properties [id, name, ram] and create 3 objects of it and print all details
public class LaptopWork {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.id = 1;
        l1.name = "Dell";
        l1.ram = 3.3;
        System.out.println("L1 is");
        System.out.println(l1.id);
        System.out.println(l1.ram);
        System.out.println(l1.name);

        l2.id = 2;
        l2.name = "app";
        l2.ram = 2.3;
        System.out.println("L2 is");
        System.out.println(l2.id);
        System.out.println(l2.name);
        System.out.println(l2.ram);

        l3.id = 5;
        l3.name = "toshiba";
        l3.ram = 6.6;
        System.out.println("l3 is");
        System.out.println(l3.id);
        System.out.println(l3.name);
        System.out.println(l3.ram);

    }
}

class Laptop {
    //properties
    int id;
    String name;
    double ram;
}