package Stacks;

class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1; //ptr is at last index
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
class StackException extends Exception{
    public StackException(String message){
        super();
    }
}
public class CustomStack {
    public static void main(String[] args) throws StackException {
        Stack stack = new Stack(3);

        stack.push(34);
        stack.push(10);
        stack.push(68);
        stack.push(98);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}

