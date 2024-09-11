import test.MyClass;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Add another line u want");
        System.out.println("changes");


        MyClass myClass = new MyClass();
        System.out.println(myClass.a); // works
       // System.out.println(myClass.b); // does not work
        // System.out.println(myClass.c); // does not work
        // System.out.println(myClass.d);// does not work
    }
}
