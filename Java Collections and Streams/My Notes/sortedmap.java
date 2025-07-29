import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmap {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<>((a,b)->b.compareTo(a));
        map.put(1, "Andrew");
        map.put(2, "Kla");
        map.put(3,"Max");
        System.out.println(map);

        NavigableMap<Integer,String> nmap=new TreeMap<>((a,b)-> a-b);
        nmap.put(1, "Dimitri");
        nmap.put(2, "Skyler");
        nmap.put(3, "Sonia");
        for(Map.Entry<Integer, String> entry : nmap.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println(nmap.firstEntry());
        System.out.println(nmap.lastEntry());
        System.out.println(nmap.tailMap(2));
        System.out.println(nmap.headMap(2));
        }
}
