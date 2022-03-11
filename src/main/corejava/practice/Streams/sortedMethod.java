package practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortedMethod {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("tom","jonh","liesha","alma");
        List<String> sortedList = name.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
