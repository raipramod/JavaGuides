package Practce5;

//Write a java program to create a class House with properties [id, name, price]. Create a constructor of it and create 3 objects of it. Add them to the list and print all details

public class HouseWork {
    public static void main(String[] args) {
        House h1 = new House(1, "abc", 23.4);
        House h2 = new House(2, "cde", 45.33);
        House h3 = new House(3, "CVB", 76.44);
        System.out.println(h1.id);
        System.out.println(h1.price);
        System.out.println(h1.name);

        System.out.println(h2.id);
        System.out.println(h2.price);
        System.out.println(h2.name);

        System.out.println(h3.id);
        System.out.println(h3.price);
        System.out.println(h3.name);
    }
}

class House {
    int id;
    String name;
    double price;

    House(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
