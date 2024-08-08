package Stacks;

public class DS_main {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);
        stack.push(34);
        stack.push(10);
        stack.push(68);
        stack.push(98);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
    }
}
