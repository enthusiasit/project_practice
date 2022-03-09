package practice.Strings;

public class StringsContains {

    public static void main(String[] args) {

        String s = "hello javatpoint readers";
        boolean data =  s.contains("javapoint");
        System.out.println(data);
        boolean data1 = s.contains("hello");
        System.out.println(data1);


        // EXAMPLE 2
        String str = "To learn Java visit Javatpoint.com";
        if(str.contains("Javatpoint")){
            System.out.println("It contains");
        }
        else{
            System.out.println("invalid input");
        }

        // EXAMPLE 3 - NULLPOINTEREXCEPTION---> java.lang.NullPointerException: Cannot invoke "java.lang.CharSequence.toString()" because "s" is null
        //comparing to NULL string
        if(str.contains(null)){
            System.out.println("valid info");
        }
        else{
            System.out.println("invalid info");
        }



    }

}
