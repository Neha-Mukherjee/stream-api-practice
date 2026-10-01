package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {


        //create a list and filter all even nos from list
        //first type to create list
        List<Integer> list1 =List.of(2,4,5,21,34,50,78,99);

        //2nd type to create list
        List<Integer> list2 =new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list2.add(21);

        //third type to create list
        List<Integer> list3=Arrays.asList(23,44,56,54,8);


//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println(list3);

        //list1
        //without stream
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(listEven);


        //using stream
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList=stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        //in one line

        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i->i>50).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
