package practice.Streams;

import java.util.stream.Stream;

public class example2 {
    public static void main(String[] args) {

        //example of stream iterating
        Stream.iterate(1,element->element+1).filter(element-> element%5==0)
                .limit(10).forEach(System.out::println);
    }
}
