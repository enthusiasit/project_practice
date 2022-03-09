package practice.FunctionalInterface;

public interface DoAble {
    default void doIt() {
        System.out.println("Do it now");
    }
}

