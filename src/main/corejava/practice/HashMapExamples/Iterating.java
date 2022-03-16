package practice.HashMapExamples;

import java.util.HashMap;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");

         Iterator<Integer> it = map.keySet().iterator();
         while(it.hasNext()){
             Integer key =  it.next();
             System.out.println("key: " +key + " value: " +map.get(key));

         }
    }
}
