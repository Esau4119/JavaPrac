class TestA{
 public void sayA(){

 }
}
class TestB extends TestA{
    public void sayB(){

    }
}
class TestC extends TestB{
    public void sayC(){

    }
}


public class Subtypes {

    public static void main(String[] args) {
        TestA a = new TestA();
       // sayHello(a); // works
        a.sayA();

        TestB b = new TestB();
        sayHello(b); // works because b is also an a
        b.sayA();
        b.sayB();

        TestC c = new TestC();
        sayHello(c);// works because c is a b which is an a
        c.sayA();
        c.sayB();
        c.sayC();
        //Declarations
        TestA ab = new TestB();
        TestA ac = new TestC();
        TestB bc = new TestC();
    }
    // has at least everything that testB has
    public static void sayHello( TestB a){
        a.sayA(); // least common between all
        //a.sayB(); //?
    }
}
