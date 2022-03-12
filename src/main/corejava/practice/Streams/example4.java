package practice.Streams;

import java.util.ArrayList;
import java.util.Locale;

public class example4 {
    public static void main(String[] args) {

        ArrayList <String> name = new ArrayList<>();
        name.add("Adam");
        name.add("Zen");
        name.add("Rae");
        name.add("Lucinda");
        name.add("Alma");
        name.stream().filter(s-> s.endsWith("a")).map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
        System.out.println("******************************");
        name.stream().sorted().map(s-> s.toLowerCase()).forEach(s-> System.out.println(s));



    }
}
