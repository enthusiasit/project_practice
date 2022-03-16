package practice.LambdaFunction;

public class CreatingThreadExample {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 is running.....");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        // Creating thread by lambda expression

        Runnable r1 = ()->{
            System.out.println("thread 2 is running......");
        };
        Thread t2 = new Thread(r1);
        t2.start();

    }
}
