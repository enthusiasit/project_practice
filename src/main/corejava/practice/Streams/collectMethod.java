package practice.Streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collectMethod {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5,3);
        Set<Integer> set =  number.stream().map(s -> s*s).collect(Collectors.toSet());
        System.out.println(set);
      IntSummaryStatistics num = (IntSummaryStatistics) number.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("sum of square num set is : " +num.getSum());

        IntSummaryStatistics num1 = (IntSummaryStatistics) number.stream().mapToInt(x->x*x).summaryStatistics();
        System.out.println("sum of square num set is : " +num1.getSum());

        IntSummaryStatistics max = number.stream().mapToInt(s->s).summaryStatistics();
        System.out.println("max no. from stream list : " +max.getMax());

        IntSummaryStatistics min = number.stream().mapToInt(s->s).summaryStatistics();
        System.out.println("min no. from the list : " +min.getMin());

        IntSummaryStatistics avg = number.stream().mapToInt(s->s).summaryStatistics();
        System.out.println("avg no. from the list : " +avg.getAverage());


    }
}
