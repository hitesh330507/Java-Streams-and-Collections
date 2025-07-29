// public class pattern {

//     public static void main(String[] args) {
//         for(int i=0;i<5;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             System.out.print("*");
//             System.out.println(" ");
//         }

//     }
// }

// * 
// ** 
// *** 
// **** 
// ***** 

// public class pattern {

//     public static void main(String[] args) {
//         for(int i=0;i<5;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             System.out.print(j+1);
//             System.out.println(" ");
//         }

//     }
// }
// 1 
// 12 
// 123 
// 1234 
// 12345

// public class pattern {

//     public static void main(String[] args) {
//         char me='A';
//         for(int i=0;i<5;i++)
//         {
//             for(int j=0;j<i+1;j++)
//             System.out.print(me);
//             me+=1;
//             System.out.println(" ");
//         }

//     }
// }
// A 
// BB 
// CCC 
// DDDD 
// EEEEE 

// public class pattern {

//     public static void main(String[] args) {
//         for(char i='A';i<='D';i++)
//         {
//             for(char j='A';j<i+1;j++)
//             System.out.print(j);
//             System.out.println(" ");
//         }

//     }
// }
// A 
// AB
// ABC
// ABCD

// public class pattern {

//     public static void main(String[] args) {
//         for(int i=1;i<5;i++)
//         {
//             for(int j=1;j<i+1;j++)
//             System.out.print(i);
//             System.out.println(" ");
//         }

//     }
// }
// 1 
// 22
// 333
// 4444

// import java.util.ArrayList;

// class fibo {
//     ArrayList<Integer> nums = new ArrayList<>();
    
//     public void fibonaci(int n) {
//         nums.clear(); // clear old values
//         if (n <= 0) {
//             return;
//         }
//         nums.add(1); // first term
//         if (n == 1) {
//             return;
//         }
//         nums.add(1); // second term
//         for (int i = 2; i < n; i++) {
//             nums.add(nums.get(i - 1) + nums.get(i - 2));
//         }
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         fibo obj = new fibo();
//         obj.fibonaci(10); // generate first 10 fib numbers

//         int k = 0;
//         for(int i = 0; i < 4; i++) {
//             for(int j = 0; j < i + 1; j++) {
//                 System.out.print(obj.nums.get(k) + " ");
//                 k++;
//             }
//             System.out.println();
//         }
//     }
// }
// 1 
// 1 2
// 3 5 8
// 13 21 34 55

// public class pattern {

//     public static void main(String[] args) {
//         for(int i=0;i<5;i++)
//         {
//             for(int j=0;j<i+1;j++){
//                 if(j>=2)
//                 System.out.print(j-1);
//                 else
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }

//     }
// }
// 0 
// 01
// 011
// 0112
// 01123


// public class pattern {

//     public static void main(String[] args) {
//         int count=1;
//         for(int i=0;i<4;i++)
//         {
//             for(int j=0;j<i+1;j++){
//             System.out.print(count);
//             count++;
//             if(count>9)
//             count=1;
//             }
//             System.out.println(" ");
            
//         }

//     }
// }
// 1 
// 23
// 456
// 7891

public class pattern {

    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            System.out.print("*");
            System.out.println(" ");
        }

    }
}