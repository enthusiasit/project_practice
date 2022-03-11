package practice.Streams;

import java.util.Arrays;
import java.util.List;

public class reduceMethod {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        // demonstration of reduce method


        int even = numbers.stream().filter(s-> s%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }
}
