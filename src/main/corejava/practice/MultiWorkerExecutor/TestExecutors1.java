package practice.MultiWorkerExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

public class TestExecutors1 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(" task1 started ........");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
                System.out.println("task1 ended...........");
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(" task2 started ........");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
                System.out.println("task2 ended...........");
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(" task3 started ........");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
                System.out.println("task3 ended...........");
            }
        };
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.shutdown();
    }
}
