// public class sumane {
//     public static void main(String[] args) {
//         int n=5;
//         int i=1;
//         int rows=0;
//         while(true)
//         {
//             n-=i;
//             if(n<0)
//             break;
//             i++;
//             n--;
//             rows++;
//         }
//         System.out.println(rows);;
//     }
// }}

import java.util.List;

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
// public class sumane {
//     public static void main(String[] args) {
//         node head=new node(1);
//         node n1 =new node(2);
//         node n2 =new node(3);
//         node n3 =new node(4);
//         node n4 =new node(5);
//         node n5 =new node(6);
//         node n6 =new node(7);
//         node n7=new node(8);
//         head.next=n1;
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
//         n5.next=n6;
//         n6.next=n7;
//        if (head == null || head.next == null)
//            System.out.println("List is too short to swap pairs.");
//         node newHead = head.next;

//         node prev = null;
//         node curr = head;

//         while (curr != null && curr.next != null) {
//             node nextNode = curr.next;
//             node nextPair = nextNode.next;

//             nextNode.next = curr;
//             curr.next = nextPair;

//             if (prev != null) {
//                 prev.next = nextNode;
//             }

//             prev = curr;
//             curr = nextPair;
//         }
//         node a=newHead;
//         while(a!=null)
//         {
//             System.out.println(a.data);
//             a=a.next;
//         }
//     }
// }

public class sumane{
    public static void main(String[] args){
        node head=new node(1);
node n1 =new node(2);
node n2 =new node(4);
head.next=n1;
n1.next=n2;
n2.next=head;


node newnode = new node(2);
node curr = head;

// Case: newnode data < head.data → insert before head
if(newnode.data < head.data){
    // find last node
    while(curr.next != head){
        curr = curr.next;
    }
    curr.next = newnode;
    newnode.next = head;
    head = newnode; // newnode becomes new head
}
// Else: insert after correct node
else {
    curr = head;
    while(curr.next != head && curr.next.data < newnode.data){
        curr = curr.next;
    }
    newnode.next = curr.next;
    curr.next = newnode;
}

// Print list
node temp = head;
do {
    System.out.println(temp.data);
    temp = temp.next;
} while(temp != head);

    }
}