import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsprac {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1, 1);
        // long sum= list.stream().filter(x -> x%2==0).count();
        // System.out.println(sum);
        // System.out.println(list.stream().filter(x->x==1).count());
        // System.out.println(list.stream().allMatch(x->x==2));
        // list.stream().forEach(x->System.out.println(x));
        // list.stream().dropWhile(x->
        // x==1).collect(Collectors.toList()).forEach(x->System.out.println(x));
        // list.stream().sorted((a,b)->b-a).forEach(x->System.out.print(x+" "));
        // int x=0;
        // And explore streams for so on methods
        // Stream.generate(()-> x+1).limit(20).forEach(System.out::print);
        // AtomicInteger count=new AtomicInteger();
        // count.set(1);
        // Stream.generate(count::getAndIncrement).limit(20).forEach(x-> System.out.print(x+" "));
        Stream.iterate(10, s->s+10).limit(10).forEach(x->System.out.println(x+" "));
      
    }
    }


