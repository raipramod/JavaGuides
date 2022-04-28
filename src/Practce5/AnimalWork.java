package Practce5;

//Write a java program to create a class Animal with properties [id, name, color]. Create another class called Cat and extends it from Animal. Add new properties sound in String. Create an object of a Cat and print all details.
public class AnimalWork {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.id = 3;
        c.color = "White";
        c.name = "Mimi";
        c.sound = "Mew Mew";
        System.out.println(c.sound);
    }
}

class Animal {
    //properties
    int id;
    String name;
    String color;
}

class Cat extends Animal {
    String sound;
}