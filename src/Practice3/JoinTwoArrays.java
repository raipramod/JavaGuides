package Practice3;

//Write a program in Java to join two arrays.

import java.util.Arrays;

public class JoinTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {0, 1, 2};
        int[] num2 = {3, 4, 5};

        int num1L = num1.length;
        int num2L = num2.length;
        int[] output = new int[num1L + num2L];
        System.arraycopy(num1, 0, output, 0, num1L);
        System.arraycopy(num2, 0, output, num1L, num2L);
        System.out.println(Arrays.toString(output));

    }
}
