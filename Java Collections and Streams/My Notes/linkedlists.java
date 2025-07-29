import java.util.Arrays;
import java.util.LinkedList;

public class linkedlists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(10,58,47,4,58,6,25));
        for( int i:linkedList2)
        {
            if(i%2==0)
            linkedList.add(i);
        }
        System.out.println(linkedList);
        linkedList.removeIf(x -> linkedList2.contains(x));
        System.out.println(linkedList);
        
    }
}
