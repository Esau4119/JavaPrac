import java.util.*;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World");
        //Review on using collections
        // List, set, stack
        int [] intArray = new int[12];
        // list is an interface, instantiate with class that implements List
        // linkedList, ArrayList
        List<Integer> myList = new ArrayList<>(); // an array
        List<Integer> myOtherList = new LinkedList<>(); // double linked list
        addToList(myList);
        addToList(myOtherList);

        // bad practice
        ArrayList<Integer> myList2 = new ArrayList<>();
        // Interface<Type> myCollection = new ChooseImplementation<>();

        //good
        Set<Integer> mySet = new HashSet<>();

        //not good
        HashSet<Integer> mySet2 = new HashSet<>();

        //good
        Set<Integer> anotherSet = new TreeSet<>();

        // In general use the interface because it will only have methods that both have in common


    }

    public static void addToList(List<Integer> list){
        // because it doesn't matter how implementation is, they both behave same
        list.add(1);
    }
}
