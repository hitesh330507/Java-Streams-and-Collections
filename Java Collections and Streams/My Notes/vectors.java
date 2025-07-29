// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>(0, 6);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);
            System.out.println(list.capacity());
            list.add(1);
            list.add(1);
            list.add(1);
            System.out.println(list.capacity());
            LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2 , 3, 4, 5, 6));
            list.addAll(list1);
            System.out.println(list);
            // In vectors the size of the vector can be determined but intially it will be 10 but can be intialized by user and the increment of the size can either be done by user choice or its doubles the existing size.
            // They are also synchronized. Collection List and its a legacy class.
        }
}
