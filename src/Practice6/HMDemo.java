package Practice6;


//Write a java program to create a HashMap of the country name and capital city and print them all.

import java.util.HashMap;

public class HMDemo {
    public static void main(String[] args) {
        HashMap<String,String> names = new HashMap<String, String>();
        names.put("Nepal", "Ktm");
        names.put("US", "DC");
        names.put("Pakistan", "Karachi");

        System.out.println(names);
    }
}
