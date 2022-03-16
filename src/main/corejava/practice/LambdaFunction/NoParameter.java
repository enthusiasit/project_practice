package practice.LambdaFunction;

public class NoParameter implements Sayable {
    @Override
    public String say() {
        return null;
    }
    public static void main(String[] args){
        Sayable s = ()->{
            return "creating java project ";
        };
        System.out.println(s.say());

    }
}
