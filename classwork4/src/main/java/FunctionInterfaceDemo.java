import java.util.function.Function;

@FunctionalInterface
interface MyInterface{
    String sayHello(String name);
}

@FunctionalInterface
interface MyInterface2<T,B>{
    String sayGreeting(T greeting, B name);
}

public class FunctionInterfaceDemo {

    public static void main(String[] args) {
      //  MyInterface i = new MyInterface();

        MyInterface i = name -> "hello"+ name;
        System.out.println(i.sayHello(" world"));

        MyInterface2<String,Integer> i2 = (a,b) -> a+ " "+ b;
        System.out.println(i2.sayGreeting("goodbye",3));

        //doStuff(a-> a + "world");

        doStuff(a -> {
            System.out.println("apply being run from function 1");
            return a+"world";
        });
        doStuff(a -> {
            System.out.println("apply being run from function 2");
            return a+"world!";
        });
       // doStuff(myFirstparameter-> myFirstparameter + "world!!");// create logic on the fly
        doStuff(FunctionInterfaceDemo::sayHello);// use existing class/object method
    }


    // Method ref sample
    // Do stuff takes a referecene to some logic that has string input and string output
    public static void doStuff(Function<String,String> test){
        System.out.println("Do stuff being called ------------");
        System.out.println(test.apply("hello"));
    }

    public static String sayHello(String a){
        System.out.println("Apply being run from say hello");
        return a + " world?";
    }

}
