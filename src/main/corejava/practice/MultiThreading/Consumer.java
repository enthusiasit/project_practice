package practice.MultiThreading;

public class Consumer extends Thread {
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while (true){
            try {
                this.c.consumer_item();
            } catch (Exception e) {


            }
            try{Thread.sleep(2000);}catch (Exception e){

            }
        }
    }
}
