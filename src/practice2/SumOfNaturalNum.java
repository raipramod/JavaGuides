package practice2;
//Write a java program to calculate sum of natural numbers.

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int num = 15;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Natural num 15 is :" + sum);
    }
}
