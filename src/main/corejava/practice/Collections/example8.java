package practice.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example8 {

    public static void main(String[] args) {

        //:LinkedHashSet---->extends the HashSet class and implements Set interface.

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
