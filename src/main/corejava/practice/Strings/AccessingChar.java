package practice.Strings;

public class AccessingChar {

    public static void main(String[] args) {

        //3. accessing first and last character from the provided string

        String str = "Welcome to Javatpoint portal";
        int length = str.length();

        System.out.println(length);

        // Fetching first character
        System.out.println("Character at 0 index is: "+str.charAt(0));

        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ str.charAt(length-1)); 
    }
}
