package practice.HashMapExamples;

import java.util.HashMap;
import java.util.Iterator;

public class RemovingObjects {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");

        System.out.println(map.size());
         Integer key = 1;
         Object value = map.remove(key);
        System.out.println("following value is removed from the Map: " +value);

        System.out.println(map.size());


    }
}
