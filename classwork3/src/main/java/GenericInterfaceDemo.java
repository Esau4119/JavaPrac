interface MyInterface<T, R>{
     R doSomething(T a); // now the param is dynamic
}

// make class dynamic -> makes interface dynamic
class MyClass <B,E> implements MyInterface<B, E>{

    @Override
    public E doSomething(B a) {
        return null;
    }
}


// Can Leave Locked at time of declaring the class
class MyClass2 implements MyInterface<String, Integer>{

    @Override
    public Integer doSomething(String a) {
        return 0;
    }
}
public class GenericInterfaceDemo {

    public static void main(String[] args) {
//        MyClass myObject = new MyClass();// no generic
//
//        myObject.doSomething(123);// already set to Integer

        MyClass<String,Float> myObject = new MyClass<>();
        myObject.doSomething("asd");
    }

}
