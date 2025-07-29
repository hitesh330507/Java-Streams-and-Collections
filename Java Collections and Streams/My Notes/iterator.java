import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@SuppressWarnings("unused")
public class iterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // for(Integer i:list)
        // {
        //     if(i%2==0)
        //     {
        //         list.remove(i);
        //     }
        // }
        // System.out.println(list);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        {
            Integer num=itr.next();
            if(num%2==0)
            {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
