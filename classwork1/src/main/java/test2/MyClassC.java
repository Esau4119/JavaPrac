package test2;

import test.MyClass;

public class MyClassC extends MyClass{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.a); // works
       // System.out.println(myClass.b);// does not work
       // System.out.println(myClass.c);// does not work even if MyClass extends
       // System.out.println(myClass.d);// does not work

        MyClassC myClassC = new MyClassC();
        System.out.println(myClassC.a); // works
         System.out.println(myClassC.b);// does not work
         // System.out.println(myClassC.c);// does not work
        // System.out.println(myClassC.d);// does not work
    }
}
