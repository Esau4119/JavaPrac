abstract class BaseClass{
    public abstract void sayHello();
}

class ChildClassA extends BaseClass{
    public void sayHello(){
        System.out.println("A");
    };
}
class ChildClassB extends BaseClass{
    public void sayHello(){
        System.out.println("B");
    };
}

//typical name is name of base class + "factory"

class BaseClassFactory {
    // the actual factory method should return a type base class
    static BaseClass getInstance(double random){
        //switching logic
        // if cases or switch also do hash table
        if (random < 0.5d){
            return new ChildClassA();
        }else{
            return new ChildClassB();
        }
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        BaseClass a = BaseClassFactory.getInstance(Math.random());
        a.sayHello();


    }
}
