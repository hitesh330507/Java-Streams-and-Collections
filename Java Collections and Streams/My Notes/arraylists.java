// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class arraylists {
//     public static void main(String[] args) throws Exception {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         // for(Integer i: list) {
//         //     System.out.println(i);
//         // }
//         // for(int i: list) {
//         //     System.out.println(i);
//         // }
//         // List<Integer> list2 = Arrays.asList( 1, 2, 3);
//         // for(Integer i: list2) {
//             // list2.add(4); //This will throw UnsupportedOperationException
//             // list2.remove(1); // This will also throw UnsupportedOperationException
//             // list2.clear(); // This will also throw UnsupportedOperationException
//             // list2.addAll(Arrays.asList(5,6,7)); // This will also throw UnsupportedOperationException
//             // list2.removeAll(Arrays.asList(1,2)); // This will also throw UnsupportedOperationException 
//             // list2.set(2,4);
//             // System.out.println(i);
//         // }
//         List<Integer> of = List.of(7,8,8,9,7);
//         //  for(int i: of) {
//             // of.set(2, 10); // This will throw UnsupportedOperationException
//             // of.add(10); // This will also throw UnsupportedOperationException
//             // of.remove(2); // This will also throw UnsupportedOperationException
//             // of.clear(); // This will also throw UnsupportedOperationException
//             // of.addAll(Arrays.asList(1,2,3)); // This will also throw UnsupportedOperationException
//             // of.removeAll(Arrays.asList(1,2,3)); // This will also throw UnsupportedOperationException
//             // System.out.println(i);
//             list.addAll(of);// This will work as list is mutable
//             System.out.println(list);
//             // list.removeA(Integer.valueOf(7));
//             list.removeAll(Arrays.asList(7));// Removes all occurrences of 7
//             System.out.println(list);
//             list.toArray();
//          }
//     }

/*
->CopyonwriteArrayList is a thread-safe variant of ArrayList, which is used in concurrent programming.
->Concurrent programming refers to simultaneous execution of read and write operations on the data structure
->Copyonwritearraylist create a new copy of the intial list and then performs the write operations thus uninterrupting the read operations
->Can be used in scenarios where read operations are more frequent than write operations
 */

// import java.util.ArrayList;
// import java.util.List;

// public class arraylists {
//     public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//         list.add("Milk");
//         list.add("Butter");
//         list.add("Cheese");
//         list.add("Eggs");
//         list.add("Yogurt");
//         for(String i:list)
//         {
//             System.out.println(i);
//             if(i=="Cheese")
//             {
//                 list.add("Rusk");
//             }
//         }
//         System.out.println(list);
//     }
    
//  }
//   java.util.ConcurrentModificationException for this above code so use copyonwritearraylist


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class arraylists {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Butter");
        list.add("Cheese");
        list.add("Eggs");
        list.add("Yogurt");
        for(String i:list)
        {
            System.out.println(i);
            if(i=="Cheese")
            {
                list.add("Rusk");
            }
            // This loop will run on the original list 
        }
        System.out.println(list); //The print of the new copied and modified list
    }
    
 }