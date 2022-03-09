package practice.Strings;

public class CountingFrequency {

    public static void main(String[] args) {

        String s = "Welcome to europe";
        int l = s.length();
        int count = 0;
        for(int i=0;i<=l-1;i++){
            if(s.charAt(i)=='e'){
                count++;
            }
        }

        System.out.println("frequency of e :" +count);

    }
}
