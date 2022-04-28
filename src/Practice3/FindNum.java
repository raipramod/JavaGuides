package Practice3;
//Write a program in Java to check array contains a given value or not.

public class FindNum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6, 0, 9, 8};
        int arrayNum = 9;
        boolean isTrue = false;
        for (int n : nums) {
            if (n == arrayNum) {
                isTrue = true;
                break;
            }
        }
        if (isTrue) {
            System.out.println(arrayNum + " is in the arraylist");
        } else {
            System.out.println(arrayNum + " is Not in the arraylist");
        }
    }
}
