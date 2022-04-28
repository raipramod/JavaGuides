package Practice3;

import java.util.*;

//Write a program in Java to reverse a String using function.

public class ReverseDemo {
    public static void main(String[] args) {
        String myWord = "Hello";
        StringBuilder myWords = new StringBuilder();
        myWords.append(myWord);
        myWords.reverse();
        System.out.println(myWords);
    }
}
