package practice.StringBuilder;

public class ReplaceMethod {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("hello");
        sb.replace(0,2,"java");
        System.out.println(sb);
    }
}

