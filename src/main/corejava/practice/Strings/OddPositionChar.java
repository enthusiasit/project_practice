package practice.Strings;

public class OddPositionChar {

    public static void main(String[] args) {

        String s = "welcome to india";

        System.out.println(s.length());

        System.out.println("--------------------------------");
       for(int i=0;i<=s.length();i++){
           if(i%2 != 0){
               System.out.println("char at "+i+" place "+s.charAt(i));
           }
       }
    }
}
