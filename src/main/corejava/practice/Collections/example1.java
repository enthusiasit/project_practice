package practice.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class example1 {

    public static void main(String[] args) {

        //Creating arraylist
        ArrayList<String> al = new ArrayList<String>();
        al.add("ravi");
        al.add("reena");
        al.add("rahul");
        al.add("raju");
        al.add("ritu");
        al.add("shyam");
        al.add("aarti");
        System.out.println(al.size());
        al.add("umesh");
        al.add("jignesh");
        System.out.println(al.size());
        System.out.println(al);

        //Traversing list through Iterator
        Iterator it = al.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }

    }
}
