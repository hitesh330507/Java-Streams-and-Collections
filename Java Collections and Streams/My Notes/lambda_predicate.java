import java.util.function.Function;
import java.util.function.Predicate;

public class lambda_predicate {
    public static void main(String[] args) {
      MathOperation sum=(a,b) -> a+b; 
      System.out.println(sum.operate(5,10)); 

      Predicate<Integer> isEven=(x-> x%2==0);
      System.out.println(isEven.test(8));

      Predicate<String> startswith=(x-> x.toLowerCase().startsWith("a"));
      Predicate<String> endwith=(x->x.toLowerCase().endsWith("t"));
      Predicate<String> and=startswith.and(endwith);
      System.out.println(and.test("Ankit"));

      Function<Integer,Integer> doubleit=(x->2*x);
      Function<Integer,Integer> tripleit=(x->3*x);
      int nanu=  doubleit.andThen(tripleit).apply(10);
      System.out.println(nanu); 
    }
}

@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}

