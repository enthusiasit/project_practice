package practice.LambdaFunction;

public class Example1 implements Drawable{
    public static void main(String[] args) {

        int width= 10;
        String name = "INDIA";
        Drawable d1 =()->{
            System.out.println("Pictures " +width);
            System.out.println(width);
            System.out.println(name);
        };
        d1.draw();
    }

    @Override
    public void draw() {

    }

}
