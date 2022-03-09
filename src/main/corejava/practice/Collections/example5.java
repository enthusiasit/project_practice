package practice.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class example5 {
    public static void main(String[] args) {

        PriorityQueue <String> queue = new PriorityQueue<>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");

        queue.add("Raj");
        System.out.println("head :" + queue.peek());
        System.out.println("head :"+ queue.element().length());
        System.out.println("iterate the element");
        Iterator it = queue.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

          queue.remove();
          queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
