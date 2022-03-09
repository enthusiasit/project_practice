package practice.Strings;

public class ConcatStrings {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Javapoint";
        String s3 = "Reader";
        String s4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println(s4);

        String s5 = s1.concat("!!!").concat("World");
        System.out.println(s5);
        String s = s1.concat("...").concat("My Frnds").concat(". ").concat(s1).concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println(s);

    }
}
