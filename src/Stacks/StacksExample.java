package Stacks;

import java.util.Stack;
public class StacksExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(10);
        stack.push(68);
        stack.push(98);
//        last in first out

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
