package practice.Strings;

public class EvenPositionChar {

    public static void main(String[] args) {

        String s = "I Love My Country";
        System.out.println(s.length());

        // to finding even position char using for loop
        System.out.println("even position character");
        for(int i=0;i<=s.length();i++){
            if (i%2 == 0){
                System.out.println("char value at "+i+" place "+s.charAt(i));
            }
        }
    }
}
