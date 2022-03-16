package practice.LambdaFunction;

import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        //forEach loop
        List<String> list = Arrays.asList("Adam","john","lisbin","samaya","zen");
        list.forEach(s -> System.out.println(s));
    }
}
