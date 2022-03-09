package practice.ExceptionHandling;

public class NumberFormatException {
    public static void main(String[] args) {
        String s = "abc";

        try {
           int i = Integer.parseInt(s);

        } catch (Exception e) {
            System.out.println("no. format exception occurs");
        }
        System.out.println("rest of the code");
    }
}
