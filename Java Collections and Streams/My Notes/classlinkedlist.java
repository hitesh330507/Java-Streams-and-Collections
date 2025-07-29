class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        next=null;
    }
}

public class classlinkedlist {
    public static void main(String[] args) {
        node head=new node(10);
        node n1=new node(20);
        node n2=new node(30);
        head.next=n1;
        n1.next=n2;
        // System.out.println("Linked List Elements:");
        // node current=head;
        // int count=0;
        // while(current!=null){
        //     count++;
        //     current=current.next;
        // }
        // System.out.println(count);
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
