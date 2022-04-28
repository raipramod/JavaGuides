package Practice1;

//Write a java program to convert float to double.

public class FloatToDoubleDemo {
    public static void main(String[] args) {
        float a = 55.055F;
        Float b = new Float(a);

        double c = b.doubleValue();

        System.out.println("New value is = " + c);
    }
}
