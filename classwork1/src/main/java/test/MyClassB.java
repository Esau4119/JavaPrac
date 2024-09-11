package test;

public class MyClassB {

    public static void main(String[] args) {
        // we are in the same package
        MyClass myClass = new MyClass();
        System.out.println(myClass.a); // works
        System.out.println(myClass.b);// works because same package
        System.out.println(myClass.c);// works because same package
       // System.out.println(myClass.d);// does not work
    }
}
