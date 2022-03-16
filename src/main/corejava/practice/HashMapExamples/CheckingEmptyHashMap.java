package practice.HashMapExamples;

import java.util.HashMap;

public class CheckingEmptyHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(4, "four");
        map.put(7, "seven");
        map.put(0, "zero");

        boolean empty = map.isEmpty();
        System.out.println("is map is empty : " +empty);

        map.clear();
        boolean isempty = map.isEmpty();

        System.out.println("is map is empty : " +isempty);

    }
}
