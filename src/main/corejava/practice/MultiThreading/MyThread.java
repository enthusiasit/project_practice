package practice.MultiThreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        // task for thread
        for (int i =  0 ;i<=10;i++){
            System.out.println("value of i is :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        // creating object ofMyThread class
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();
        //object of another thread
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();


    }
}
