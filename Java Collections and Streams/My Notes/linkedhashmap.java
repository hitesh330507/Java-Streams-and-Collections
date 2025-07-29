// import java.util.LinkedHashMap;
// import java.util.Map;

// public class linkedhashmap {
//     public static void main(String[] args) {
//         LinkedHashMap<Integer, String> linkedmap=new LinkedHashMap<>(16,0.75f,true);
//         linkedmap.put(101, "Alice");
//         linkedmap.put(102, "Bob");
//         linkedmap.put(103, "Charlie");
//         linkedmap.put(104, "David"); 

//         linkedmap.get(103);
//         linkedmap.get(104);
//         linkedmap.get(101);
//         linkedmap.get(101);
//         linkedmap.get(104);

//         for(Map.Entry<Integer, String> entry : linkedmap.entrySet()) {
//             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//         }
//     }
// }
// This code demonstrates the use of LinkedHashMap with access order.
//Changing the access order allows us to maintain the order of elements based on their last access time.
// The output will show the order of keys based on their last access, not the order they were added.
//  Lets Demonstrate the LRU cache using linkedhashmap

import java.util.LinkedHashMap;
import java.util.Map;

class LRU<K,V> extends LinkedHashMap<K,V> {
    private int capacity;
     public LRU(int capacity) {
        this.capacity = capacity;
     }
     @Override
     protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return  size() > capacity;
     }
    }
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedmap = new LRU<>(3);
        linkedmap.put(101, "Alice");
        linkedmap.put(102, "Bob");
        linkedmap.put(103,"Max");
        linkedmap.put(104, "Charlie");
         // This will remove the eldest entry (101, "Alice")
        
        for(Map.Entry<Integer,String> entry:linkedmap.entrySet())
        {
            System.out.println("Id " + entry.getKey() + ", Name: " + entry.getValue());
        }

    }
    
}
// In the LRU cache expample we have written our own method that is removeEldestEntry which is called by the put method of LinkedHashMap.
// And in this method it removes the element in the hashmap which is used the least and then it compares with the size if the space is not enough then the leats used element is removed