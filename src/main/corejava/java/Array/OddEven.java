package java.Array;

public class OddEven {

    public static void main(String[] args) {
         int a[] = {5,3,6,2,9,17,8,4,10};
        System.out.println("find odd numbers");
        for (int i=0; i<a.length;i++){
            if (a[i]%2 != 0){
                System.out.println(a[i] +" is odd num");
            }
        }
        System.out.println("find even numbers ");
        for(int i=0;i<a.length;i++){
            if (a[i]%2 ==0){
                System.out.println(a[i]+" is even num");
            }
        }

    }
}
