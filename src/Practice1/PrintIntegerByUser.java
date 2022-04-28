package Practice1;

//Write a program to print an integer entered by the user.

import java.util.Scanner;

public class PrintIntegerByUser {
    public static void main(String[] args) {
        System.out.println("Please Enter Integer :");
        Scanner obj = new Scanner(System.in);
        int userInput = obj.nextInt();
        System.out.println("User Input is :" + userInput);

    }
}
