import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringDemo {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(myList);
        System.out.println(doFilter(myList, a-> a > 5));
        System.out.println(doFilter(myList, a-> a < 5));
        System.out.println(doFilter(myList, a-> a % 2 ==0 ));
        System.out.println(doFilter(myList,FilteringDemo::myFilter));
        FilteringDemo myFIlterDemo = new FilteringDemo();
        System.out.println(doFilter(myList,myFIlterDemo::myInstanceFilter));


    }

    static Boolean myFilter (Integer a ){
        return a % 2 !=0;
    }


    Boolean myInstanceFilter (Integer a ){
        return a == 4;
    }

    // returns new list where each item passes some condition
    static List<Integer> doFilter(List<Integer> list, Predicate<Integer> filter){
        List<Integer> filteredList = new ArrayList<>();
        for(int i = 0; i <list.size(); i++){
            // filer.test is different everytime
            if(filter.test(list.get(i))){
                filteredList.add(list.get(i));// if passes filter, added to filtered list
            }
        }
        return filteredList;
    }
}