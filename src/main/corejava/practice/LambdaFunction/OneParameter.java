package practice.LambdaFunction;

public class OneParameter implements Drawable1{
    @Override
    public String draw(String name) {
        return null;
    }

    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Drawable1 da = (name)-> {
            return "Hello, " + name;
        };
        System.out.println(da.draw("User"));

        Drawable1 da1 = (name)-> {
            return name +" is looking beautiful.";
        };
        System.out.println(da1.draw("Cindrella"));

        // You can omit function parentheses
        Drawable1 d = name -> {
            return "Hello, " + name;
        };
        System.out.println(da.draw("User"));
    }
}
