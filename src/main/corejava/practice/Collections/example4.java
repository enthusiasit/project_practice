package practice.Collections;

import java.util.Iterator;
import java.util.Stack;

public class example4 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("ravi");
        s.push("suresh");
        s.pop();
        s.push("ajay");
        s.pop();
        System.out.println(s.size());
        s.push("suresh");
        s.push("ajay");
        System.out.println(s.size());

        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
