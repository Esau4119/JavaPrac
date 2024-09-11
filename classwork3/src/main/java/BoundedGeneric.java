interface TestInterface{
    void doTest();
}

class ClassA implements TestInterface{

    @Override
    public void doTest() {

    }
}
class ClassB implements TestInterface{
    @Override
    public void doTest() {

    }
}
// not a subclass of TestInterface
// The "T" must be a subclass
class MyGenericClass<T extends TestInterface>{
    public void doStuff(T input){
        input.doTest();// restricted to only objects that are of type TestInterface, safe to use
    }
}

public class BoundedGeneric {
    public static void main(String[] args) {
        MyGenericClass<ClassA> myGenericClass = new MyGenericClass<>();
        myGenericClass.doStuff(new ClassA());

        MyGenericClass<ClassB> myGenericClass2 = new MyGenericClass<>();
        myGenericClass2.doStuff(new ClassB());
        // Cant do String because String is not a subclass of TestInterface
       // MyGenericClass<String> myGenericClass3 = new MyGenericClass<>();
    }

}
