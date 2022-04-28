package practice2;

//Write a java program to check whether a character is a vowel or consonant.

public class VowelOrConsonent {
    public static void main(String[] args) {
        String letter = "a";
        switch (letter) {
            case "a":
                System.out.println("Vowel Letter");
                break;
            case "b":
                System.out.println("No vowel");
                break;
            case "c":
                System.out.println("Vowel or Not ");
                break;
            default:
                System.out.println("Error");

        }
    }
}
