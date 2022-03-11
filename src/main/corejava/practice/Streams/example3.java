package practice.Streams;

import java.util.ArrayList;
import java.util.List;

public class example3 {
    int id;
    float price;
    String name;

    //creating constructor
    public example3(int id,float price, String name){
        this.id =id;
        this.name = name;
        this.price= price;
    }
    public static void main(String[] args) {

        List<example3> product = new ArrayList<example3>();
        //Adding Products
        //productsList.add(new Product(1,"HP Laptop",25000f));
        product.add(new example3(1,25000,"HP "));
        product.add(new example3(2,35000,"Dell "));
        product.add(new example3(3,30000,"Lenovo "));
        product.add(new example3(4,65000,"Mac "));
        product.add(new example3(5,45000,"Sony "));

        product.stream().filter(s->s.price<=65000).forEach(s-> System.out.println(s.name));

    }
}
