package test;

public class MyClass {

    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {
       MyClass myClass = new MyClass();
        System.out.println(myClass.a); // works
        System.out.println(myClass.b);// works
        System.out.println(myClass.c);// works
        System.out.println(myClass.d);// works
    }


}
