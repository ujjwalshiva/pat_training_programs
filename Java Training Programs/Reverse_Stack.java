import java.util.*;

public class Reverse_Stack {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<Integer>();

        // Push 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        System.out.println("Original Stack: " + stack);

        // Create a new stack to hold the reversed elements
        Stack<Integer> reversedStack = new Stack<Integer>();

      
        // Pop elements from the original stack and push them into the reversed stack
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reversedStack);
    }
}