package practice.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class example7 {
    public static void main(String[] args) {
       // repeated element not allowed in hashset
        HashSet<String> hs = new HashSet<>();
        hs.add("jonh");
        hs.add("rio");
        hs.add("jonh");
        hs.add("kim");
        hs.add("joey");
        hs.add("kim");
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
