package practice.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class example2 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("ravi");
        ll.add("vijay");
        ll.add("ravi");
        ll.add("vijay");
        System.out.println(ll);
        System.out.println(ll.size());

        //Traversing list through Iterator
        Iterator it =ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
