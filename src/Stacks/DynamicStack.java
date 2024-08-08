package Stacks;

public class DynamicStack extends Stack {
//    dynamic stack is never full

    public DynamicStack() {
        super(); // it will call Stacks.CustomStack
    }
    public DynamicStack(int size) {
        super(size); // it will call Stacks.CustomStack size
    }

//    in dynanmic stack - pop, peek, isempty etc will all remain same
//    push will not

    @Override
    public boolean push(int item) {
        if(this.isFull()){
//            double the array size
            int[] temp = new int[data.length*2];

//            copy all prev items in new data
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
//        at this point array is not full
        //insert item
        return super.push(item);
    }
}

