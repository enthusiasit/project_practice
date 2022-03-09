package practice.ExceptionHandling;

public class NullPointerException {
    public static void main(String[] args) {


        try {
           String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println("null pointer exception occurs");
        }
        System.out.println("rest of the code");
    }
}
