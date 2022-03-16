package practice.HashMapExamples;

import java.util.HashMap;

public class ContainsKeysAndValues {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");

        System.out.println("does map contains 5 as key : " +map.containsKey(5));
        System.out.println("does map contains 5 as value : " +map.containsValue(5));
        System.out.println("does map contains 5 as value : " +map.containsValue("five"));
    }
}
