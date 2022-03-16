package practice.LambdaFunction;

public class MultipleMessage implements Sayable1 {
    public static void main(String[] args) {

        Sayable1 s = (message)->{
            String st1 = "Time is precious";

            String st2 = st1 + message;
           return st2;
        };
        System.out.println(s.say(" to each and every person in this world."));
    }

    @Override
    public String say(String message) {
        return null;
    }
}
