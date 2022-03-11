package practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectMethod {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5,3);
        Set<Integer> set =  number.stream().map(s -> s*s).collect(Collectors.toSet());
        System.out.println(set);
    }
}
