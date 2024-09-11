import java.util.ArrayList;
import java.util.List;
public class MyGeneric<T> { //T is a place holder

    T a;
    MyGeneric next;

    public MyGeneric (T a, MyGeneric next) {
        this.a = a;
        this.next = next;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<String> myStringList = new ArrayList<>();
        List myFreeFormList = new ArrayList();// don't do this
        myList.add(123); //must add ints only
        myStringList.add("123"); //Locked to strings


        myFreeFormList.add (123);
        myFreeFormList.add("123");

       // System.out.println((Integer)myFreeFormList.get(1)/2);

        MyGeneric<Integer> myNode1 = new MyGeneric<>(3, null);
        MyGeneric<Integer> myNode2 = new MyGeneric<>(4, myNode1);



        //  I can reuse the same class for everything
        MyGeneric<String> myNode1a = new MyGeneric<>("3", null);
        MyGeneric<String> myNode2a = new MyGeneric<>("4", myNode1);
    }

}
