package Practice1;

//Write a program in java to remove all whitespaces from the string.

public class RemoveWhiteSpace {
    public static void main(String[] args) {

        String myString = " Hello I am Pramod Rai ";
        myString = myString.replaceAll("\\s", "");
        System.out.println(myString);
    }
}
