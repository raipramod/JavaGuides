package Practice6;

//Write a java program to create LinkedList of 7 people’s names. Sort them in descending order and print all person’s details.

import java.util.Collections;
import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Pramod");
        l.add("Rai");
        l.add("jon");
        l.add("Milan");

        Collections.sort(l);
        System.out.println(l);

    }
}
