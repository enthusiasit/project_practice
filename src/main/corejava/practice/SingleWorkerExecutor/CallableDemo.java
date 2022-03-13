package practice.SingleWorkerExecutor;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Creating callable method by lambda expression
        Callable<String> aTask = ()-> "My First Task";

        ExecutorService aExecutorService = Executors.newSingleThreadExecutor();
        Future<String> aFutureTask = aExecutorService.submit(aTask);
        Future<Integer> aFutureTask2 = aExecutorService.submit(new callableExample(10));
        System.out.println("String :" +aFutureTask.get());
        System.out.println( "Integer :" +aFutureTask2.get());

    }
}
