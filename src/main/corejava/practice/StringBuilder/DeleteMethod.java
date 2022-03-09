package practice.StringBuilder;

public class DeleteMethod {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Goodness");
        System.out.println(sb.length());
        sb.delete(4,7);
        System.out.println(sb);
    }
}
