
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
@SuppressWarnings("unused")
public class identityhashmap {
    public static void main(String[] args)
    {
        IdentityHashMap<String, Integer> list=new IdentityHashMap<>();
        String key1= new String("Key");
        String key2= new String("Key");
        list.put(key1,1);
        list.put(key2,2);
        System.out.println(list);
    }
}
/*
-->IdentityHashMap uses reference equality (==) instead of object equality (.equals()) to compare keys.
-->This means that two different String objects with the same content will be treated as different keys.
-->In this case, key1 and key2 are different objects, so they are treated as separate keys in the IdentityHashMap, even though they have the same content.
-->IdentityHashMap is useful when you want to ensure that keys are compared by reference rathervthan by value. 
*/
    