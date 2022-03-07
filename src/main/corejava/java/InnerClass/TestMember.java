package java.InnerClass;

public class TestMember {

    public int data = 50;

    //Exception in thread "main" java.lang.SecurityException: Prohibited package name: java.InnerClass
    class Inner{
        void msg (){
            System.out.println("data value is :" +data);
        }

    }
        public static void main(String[] args) {
            TestMember t1 = new TestMember();
            TestMember.Inner t2 = t1.new Inner();
            t2.msg();

    }
}
