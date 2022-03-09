package practice.StringBuilder;

public class AppendMethod {

    public static void main(String[] args) {

        //append() method concatenates the given argument with this String.

        StringBuffer sb = new StringBuffer("Good");
        sb.append(" Morning"); //now original string is changed
        System.out.println(sb); // prints good morning
    }
}
