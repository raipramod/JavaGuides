package Practice6;

import java.util.ArrayList;

//Write a java to declare ArrayList and add 10 city names to it. Also, print all details.

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> demo = new ArrayList<>();
        demo.add("Ktm");
        demo.add("pokhara");
        demo.add("aurora");
        demo.add("Hello");
        demo.add("Khotang");
        demo.add("Japan");
        demo.add("Dharan");

        System.out.println("All city names ");
        System.out.println(demo);

    }
}
