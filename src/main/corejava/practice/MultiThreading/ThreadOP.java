package practice.MultiThreading;

class UserThread extends Thread{
    public void run(){
       // task for thread....
        System.out.println("this is user defined thread");
    }
}

public class ThreadOP {
    public static void main(String[] args) {

        System.out.println("program started***********");
        int a=50, b=10;
        int c=a+b;
        System.out.println(c);
        // Thread ....
        Thread t = Thread.currentThread();
        // get the thread name
        String tname = t.getName();
        System.out.println("current thread name is :"+tname);


        // set the thread name
         t.setName("Main Thread");

        System.out.println("changed the current thread name :" +t.getName());

        // sleep operation
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }
        // get Id operation
        System.out.println(t.getId());

        // going to start user defined thread
        UserThread thread = new UserThread();
        thread.start();

        System.out.println("program ended ***********");
    }
}
