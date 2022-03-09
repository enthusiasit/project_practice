package practice.Collections;

import java.util.Iterator;
import java.util.Vector;

public class example3 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");

       Iterator it= v.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }

        System.out.println(v.size());
        System.out.println(v);
    }
}
