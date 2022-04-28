package Practice1;

//Write a program to swap two numbers.

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 20;
        int b = 80;
        System.out.println("Before swapping is");
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping ");
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);

    }
}
