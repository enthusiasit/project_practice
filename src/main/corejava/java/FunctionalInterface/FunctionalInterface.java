package java.FunctionalInterface;

public class FunctionalInterface implements Sayable {

    public static void main(String[] args) {

        FunctionalInterface fi = new FunctionalInterface();
         fi.say("");
         fi.doIt();
    }
    @Override
    public void say(String msg) {
        System.out.println("hello world");

    }
}
