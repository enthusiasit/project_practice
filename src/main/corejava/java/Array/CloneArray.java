package java.Array;

public class CloneArray {
    public static void main(String[] args) {

        int a[]= {5,10,15,20,25};
        System.out.println("print the original array first");
        for(int i : a)
        System.out.println(i);

        System.out.println("print the clone array");
        int replica[] = a.clone();
        for ( int copy:replica) {
            System.out.println(copy);


        }
    }
}
