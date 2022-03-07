package java.FunctionalInterface;

public class FuncInt implements sayAble2 {

    public static void main(String[] args) {
        FuncInt f = new FuncInt();
        f.say("this is java program");
    }
    @Override
    public void say(String msg) {

        System.out.println(msg);
    }
}
