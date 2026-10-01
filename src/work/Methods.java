package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //fliter(Predicate)
                 //boolean value function it will return true or false
                 //e-> e>10 if predicate return true the elements will be filtered /returned


        //map(function)-return value
        /*
        each element operation

         */

        List<String> name= List.of("neha","ankit","aman");
        name.stream().filter(e->e.startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> list=List.of(1,2,3,4);
       List<Integer> newList= list.stream().map(i->i*i).collect(Collectors.toList());
       System.out.println(newList);

       name.stream().forEach(e->{
           System.out.println(e);
       });
       name.stream().forEach(System.out::println);
      //sorted
       list.stream().sorted().forEach(System.out::println);
       Integer integer =list.stream().min((x,y)->x.compareTo(y)).get();
       Integer integer2 =list.stream().max((x, y)->x.compareTo(y)).get();

       System.out.println("min"+integer);
        System.out.println("max"+integer2);

    }


}
