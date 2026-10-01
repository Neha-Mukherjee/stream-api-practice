package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //stream api- COLLECTION PROCESS
        //collection/groupofobject

        //1-blank
        Stream<Object> emptyStream = Stream.empty();
        //will return blank nothing
       // emptyStream.forEach(e->{System.out.println(e);});
        //2nd way with array obbject collection
        String name[] = {"neha","durgesh","suresh","diya"};
        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e->{System.out.println(e);});


        //3 with builder pattern
        //blank string
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{1,2,3});
        stream.forEach(e->{System.out.println(e);});

        //5 List set
        List<Integer> list2 =new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list2.add(21);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e->{System.out.println(e);});


    }
}
