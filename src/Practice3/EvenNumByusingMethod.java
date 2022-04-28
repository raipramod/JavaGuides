package Practice3;

//Write a program in Java to print even number between intervals using methods.

public class EvenNumByusingMethod {
    public static void main(String[] args) {
        printEvenNum(100);

    }
    public static int printEvenNum(int a) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        return a;
    }
}
