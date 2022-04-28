package Practice1;
//
//Write a program in JAVA that finds simple interest.
//        Formula= p * t * r / 100

public class SimpleInterest {
    public static void main(String[] args) {
        //Declare and iniatialze the ptr

        double p = 200.33;
        double t = 3.5;
        double r = 2.9;
        double si = (p * t * r) * 100;
        System.out.println("Simple Interest is :" + si);
    }
}
