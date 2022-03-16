package practice.HashMapExamples;

import java.util.HashMap;

public class CreateAndAddObject {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");

        // retrieving values

        Integer key = 7; String value = map.get(key);
        System.out.println("key is: " +key +" value is : " +value);

        Integer key1 = 0; String value1 = map.get(key);
        System.out.println("key is: " +key1 +" value is : " +value1);




    }
}
