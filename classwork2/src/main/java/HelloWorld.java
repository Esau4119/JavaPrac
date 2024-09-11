class ClassA {
    public void saySomething() {
        System.out.println("Hello from A!");
    }

    public static void saySomethingStatic() {
        System.out.println("hello from A!");
    }

}

class ClassC extends ClassA {
    public void saySomething() {
        System.out.println("Hello from C!");
    }
}

class ClassB extends ClassA {

    public void saySomethingSuper() {
        super.saySomething();// specifically calls the version of superclass
    }

    @Override //  doesn't change anything just announces that it is overridden
    public void saySomething() {
        System.out.println("Hello from B!");
    }

    public static void saySomethingStatic() {
        System.out.println("hello from A!");
    }
}

public class HelloWorld {

    public static void main(String args[]) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        //subtype poly
        ClassA ab = new ClassB();

        a.saySomething(); //A
        b.saySomething(); //B
        ab.saySomething(); //B
        System.out.println("-------------");
        a = b;
        a.saySomething();// B
        b.saySomethingSuper();//a
        System.out.println("-------------");

        //Static ones
        ClassA.saySomethingStatic(); // A
        ClassB.saySomethingStatic(); // B
    }
}
