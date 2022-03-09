package practice.Array;

import java.util.Arrays;

public class AnonymousArray {
    /*
     1. Creation of anonymous array to instant use [one time usages].
     2. it is created without name
     3. For Anonymous array creation, do not mention size in [].
      The number of values passing inside {} will become the size.
      SYNTAX : new<datatypes> []{<list of values with commas for seperation>};
     */

    public static void main(String[] args) {
        array(new int[] {5,10,20});
    }


    public static void array(int[] a){
        int t = 0;
       for(int i : a) {

           t = t + i;
          // System.out.println("Value of array is :" +t);
       }
           System.out.println("Value of array is :" +t);


    }


}