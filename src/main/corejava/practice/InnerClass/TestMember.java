package practice.InnerClass;

public class TestMember {

    public int data = 50;


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
