import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        // pushing element onto the stack
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(11);

        // popping the element from the stack
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // peeking at the top element of the stack
        // System.out.println(stack.peek());

        // checking if the stack is empty
        // System.out.println(stack.isEmpty());

        // search element in the stack
        System.out.println(stack.search(7));
    }
}