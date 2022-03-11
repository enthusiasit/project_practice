package practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapMethod {

    public static void main(String[] args) {

        //creating the list of integers
        List<Integer> num = Arrays.asList(2,3,4,5);

        //demonstration of map method
        List<Integer> square = num.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(square);


    }
}
