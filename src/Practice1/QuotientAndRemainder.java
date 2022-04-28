package Practice1;

//
//Write a program to find the quotient and remainder of Two Integers.

public class QuotientAndRemainder {
    public static void main(String[] args) {
        double num = 9;
        double num1 = 4;
        double remainder = num % num1;
        double qoutient = num / num1;

        System.out.println("Remainder is :" + remainder);
        System.out.println("Quotient is :" + qoutient);
    }
}
