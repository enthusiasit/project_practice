package practice.SingleWorkerExecutor;

public class MyNewtask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My task3....");
    }
}
