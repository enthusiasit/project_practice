package java.Array;

public class TestArray {
    /*
    What is the class name of java ???
    In java , array is an object and for array object , a proxy class is created whose name can be obtained by
    getClass().getName() method on the object.
     */
    public static void main(String[] args) {

        // declaration and initialization first
        int a[] = {1,6,4,5};
        // getting the class name of java array
        Class c = a.getClass();
        String name = c.getName();
        //printing the class name of java array
        System.out.println(name);
    }
}
