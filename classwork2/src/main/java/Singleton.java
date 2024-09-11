public class Singleton {

    public int a;// something for testing

    //only 1 instance ever
    private static Singleton instance ;//= new Singleton();
    // Step 1 make constructor private
    private Singleton(){
        // blocks outside classes form using new
        // can be empty
        System.out.println("Instance being created");
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    // ----------------Testing --------------------------
 /*
 * Advantages?
 * - get the same instance anywhere
 * - Always the same object good for sharing data or access to something
 *
 * Differences between static
 * - static does not need a new object
 * - static cant implement interfaces and extend
 * - pass a singleton object by reference. pas into methods ect
 * - objects go in heap, static goes in stack
 * */


    public static void main(String[] args) {
        Singleton a = getInstance();
        //Singleton b = new Singleton();
        a.a = 2;
       // b.a = 2;
        System.out.println(a.a);//2
       // System.out.println(b.a);//2
        System.out.println("-----");

        doStuff();
    }

    public static void doStuff(){
        Singleton a = getInstance();
       // Singleton b = new Singleton();

        System.out.println(a.a);//2
       // System.out.println(b.a);//0
        a.a = 3;
      //  b.a = 3;
        System.out.println("-----");
        doStuff2();
    }
    public static void doStuff2(){
        Singleton a = getInstance();
       // Singleton b = new Singleton();
        System.out.println(a.a);//3
       // System.out.println(b.a);//0
    }
}
