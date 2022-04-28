package Practice1;

//Write a program to print String entered by the user.

import java.util.Scanner;

public class StringByUserInput {
    public static void main(String[] args) {
        System.out.println("Please Enter String");
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        System.out.println("User Input is :" + myString);

    }
}
