package practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example1 {

    int id;
    float price;
    String name;

    //creating constructor
    public example1(int id,float price, String name){
        this.id =id;
        this.name = name;
        this.price= price;
      }
    public static void main(String[] args) {

      List<example1> product = new ArrayList<example1>();
        //Adding Products
        //productsList.add(new Product(1,"HP Laptop",25000f));
        product.add(new example1(1,25000,"HP "));
        product.add(new example1(2,35000,"Dell "));
        product.add(new example1(3,30000,"Lenovo "));
        product.add(new example1(4,65000,"Mac "));
        product.add(new example1(5,45000,"Sony "));
        List<Float> pp = product.stream().filter(s->s.price>30000).map(s->s.price).collect(Collectors.toList());
        System.out.println(pp);








    }
}
