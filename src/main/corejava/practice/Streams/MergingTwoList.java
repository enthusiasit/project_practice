package practice.Streams;

import net.jodah.failsafe.internal.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergingTwoList {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("reo","tokyo","nerobi","berlin","helsenki","tamayo");
        List <String> names1 = Arrays.asList("Professor","lesbin","palamo");

        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        boolean result =  newStream.anyMatch(s-> s.equalsIgnoreCase("adam"));
        System.out.println(result);

//        boolean flag = newStream.anyMatch(s-> s.equalsIgnoreCase("Professor"));
//        System.out.println(flag);

    }
}
