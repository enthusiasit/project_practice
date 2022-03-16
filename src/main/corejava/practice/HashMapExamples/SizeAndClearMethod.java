package practice.HashMapExamples;

import java.util.HashMap;

public class SizeAndClearMethod {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");
        System.out.println("size of map : " +map.size());
        map.clear();
        System.out.println("size of map : " +map.size());
    }
}
