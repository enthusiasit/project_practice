package practice.Streams;

import java.util.Arrays;
import java.util.List;

public class forEachMethod {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        // demonstration of forEach method
       // number.stream().map(x->x*x).forEach(y->System.out.println(y))
        numbers.stream().map(s->s*s).forEach(t-> System.out.println(t));
    }
}
