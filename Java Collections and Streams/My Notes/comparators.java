// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// // class sort implements Comparator<String> {
// //     @Override
// //     public int compare(String a, String b) {
// //     return b.length()-a.length();// Sort by length in descending order
// //     }
// // }
// //a-b -> ascending order
// //b-a -> descending order
// //a.compareTo(b) -> natural order
// //b.compareTo(a) -> reverse natural order
// public class comparators {
//     public static void main(String[] args) {
//         List<String> list=new ArrayList<>();
//         list.add("banana");
//         list.add("apple");
//         list.add("date"); 
//         list.add("cherry");

//         list.sort((a,b)-> b.compareTo(a)); // Sort by length in ascending order;
//         System.out.println(list); // Output: [banana, cherry, apple, date]
//     }
// }

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;

// class student {
//     private String name;
//     private double gpa;
//     public student(String name, double gpa)
//     {
//         this.name=name;
//         this.gpa=gpa;
//     }
//     public String getName() {
//         return name;
//     }
//     public double getgpa() {
//         return gpa;
//     }  
// }
// class sort implements Comparator<student>{
//     @Override
//     public int compare(student a,student b){
//         return Double.compare(b.getgpa(),a.getgpa());
//     }
// }

// public class comparators {

//     public static void main(String[] args) {
//         List<student> list = new ArrayList<>();
//         list.add(new student("alice", 8.8));
//         list.add(new student("bob", 7.8));
//         list.add(new student("charlie", 9.2));
//         list.add(new student("ana", 8.2));
//         list.add(new student("rachale", 9.5));
//         // Sort by gpa in descending order
//         list.sort(new sort());
        
//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i).getName());
//         }
//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// class student {
//     private String name;
//     private double gpa;
//     public student(String name, double gpa)
//     {
//         this.name=name;
//         this.gpa=gpa;
//     }
//     public String getName() {
//         return name;
//     }
//     public double getgpa() {
//         return gpa;
//     }  
// }

// public class comparators {

//     public static void main(String[] args) {
//         List<student> list = new ArrayList<>();
//         list.add(new student("alice", 8.8));
//         list.add(new student("bob", 7.8));
//         list.add(new student("charlie", 9.2));
//         list.add(new student("ana", 8.8));
//         list.add(new student("rachale", 9.5));
//         // Sort by gpa in descending order
//         list.sort((a,b)->{
//             // if(b.getgpa()>a.getgpa())
//             // return 1;
//             // else if(b.getgpa()<a.getgpa())
//             // return -1;
//             // else 
//             return a.getName().compareTo(b.getName()); // If GPA is equal, compare names in reverse alphabetical order
            
            
// });
        
//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i).getName());
//         }
//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// class student implements Comparable<student>{
//     private String name;
//     private double gpa;
//     public student(String name, double gpa)
//     {
//         this.name=name;
//         this.gpa=gpa;
//     }
//     public String getName() {
//         return name;
//     }
//     public double getgpa() {
//         return gpa;
//     }  
//     // @Override
//     //     public int compareTo(student o) {
//     //     return this.getName().compareTo(o.getName());
//     //     }
//     @Override
//     public int compareTo(student o)
//     {
//         return Double.compare(o.getgpa(),this.getgpa());
//     }
    
// }



// public class comparators {

//     public static void main(String[] args) {
//         List<student> list = new ArrayList<>();
//         list.add(new student("alice", 8.8));
//         list.add(new student("bob", 7.8));
//         list.add(new student("charlie", 9.2));
//         list.add(new student("ana", 8.2));
//         list.add(new student("rachale", 9.5));
//         // Sort by gpa in descending order
//         list.sort(null);
        
//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i).getName()+":"+list.get(i).getgpa());
//         }
//     }
// }

import java.util.Vector;

public class comparators {
    public static void main(String[] args)
    {
        Vector<String> v= new Vector<>();
    }
}