package practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterMethod {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("Raju","Reena","Anju","Shital");

        //demonstration of filter method

        List<String> filteredName = name.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(filteredName);

        List<String> filteredName1 = name.stream().filter(s -> s.endsWith("u")).collect(Collectors.toList());
        System.out.println(filteredName1);


    }
}
