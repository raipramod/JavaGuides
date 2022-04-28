package Practce5;

enum Gender {
    Male,
    Female,
    Others;
}

public class EnumClass {
    public static void main(String[] args) {
        Gender g = Gender.Female;
        Gender g1 = Gender.Male;
        Gender g3 = Gender.Others;
        System.out.println(g);
        System.out.println(g1);
        System.out.println(g3);
    }
}
