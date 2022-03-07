package java.Array;

import java.util.Arrays;

public class FindDuplicateElement {

    /*
    FIRST LET'S DISCUSS ABOUT ALGORITHM
   1. Declare and initialize an array.
   2. Duplicate elements can be found using two loops. The outer loop will iterate through
   the array from 0 to length of the array. The outer loop will select an element. The inner
   loop will be used to compare the selected element with the rest of the elements of the array.
   3.If a match is found which means the duplicate element is found then, display the element.
     */

    public static void main(String[] args) {
        // initilize the array
        int a[] = {1,2,3,4,2,5,8,5,6,7,6};
         for(int i =0 ;i<a.length;i++){ //this loop iterate the array and select it
             for(int j=i+1;j<a.length;j++){ // this loop compare the element
                 if(a[i]==a[j]){// given the condition to find match element
                     System.out.println(a[j] + " this is duplicate element");
                 }
             }
         }
    }

}
