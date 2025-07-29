import java.util.LinkedList;
import java.util.Stack;

public class stacks {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        
        //LinkedList as Stack
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(1);
        list.addLast(5);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getLast());
        // Similar in the above manner arraylist can also be used as stack.
    }
}
