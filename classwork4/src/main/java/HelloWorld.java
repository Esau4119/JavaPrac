import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World");


        String myString = "my String";
        var myString2 = "my String"; // It knows its type string
        // myString2 = 123; // can't do this.
        myString2 = "My other string "; // permanently type string

        var myHello = new HelloWorld();
        // myHello = 123;


        // in line method declaration
        Function<String, String > myFunction = a -> "hello " +a;
        System.out.println(myFunction.apply("world"));


        BiFunction<String, Integer, String > myFunction2 = (a, b) ->{
            String out = "";
                    for(int i =0 ; i < b; i++){
                        out += a;
                    }
                    return out;
        };

        System.out.println(myFunction2.apply("*", 5));
        System.out.println(myFunction2.apply("+", 5));



        Predicate<Integer> myFilter = a -> a > 10;
        System.out.println(myFilter.test(9));
        System.out.println(myFilter.test(11));

    }
    public static String myMethod (String a ){
        return "hello" + a;
    }

}
