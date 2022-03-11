package practice.Inheritance;

public class Car extends Vehicle {

    public void gear(){
        System.out.println("car : gear");
    }
    public void start (){
        System.out.println("car : start");
    }
    public void stop (){
        System.out.println("car : start");
    }

    public static void main(String[] args) {

        // Creating Static polimorphism--> compile time polimorphism
        Car ob = new Car();
        ob.wheel();
        ob.start();
        ob.gear();

        //Creating Dynamic polimorphism--> run time polimorphism
        Vehicle v = new Car();
          v.start();
          v.wheel();
          v.stop();

    }
}
