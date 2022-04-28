package Practice3;
//Write a program in Java to calculate power of certain number. For e.g 5^3=125

public class PowerDemo {
    public static void main(String[] args) {
        printMath(5, 3);
    }

    public static int printMath(int a, int b) {
        System.out.println(Math.pow(a, b));
        return a;
    }
}
