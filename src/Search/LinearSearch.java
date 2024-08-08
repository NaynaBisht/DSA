package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1,2,75,15,20,88,-5,-23};
        int target = -5;

        int ans1 = linearSearch(num,target);
        System.out.println(ans1);

        int ans2 = linearSearch2(num,target);
        System.out.println(ans2);

        boolean ans3 = linearSearch3(num,target);
        System.out.println(ans3);
    }
    // search in the array : return index
    // not found - 1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i<arr.length; i++){
            // check for element at every index if it is equal to target
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        // this line will execute when none of the above have executed
        // hence no element found
        return -1;
    }

    // return the element itself
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        // using enhanced for
        for (int element : arr){
            // check for element at every index if it is equal to target
            if (element==target){
                return element;
            }
        }
        // this line will execute when none of the above have executed
        // hence no element found
        return -1;
    }

    // search and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for (int element:arr){
            // check for element at every index if it is equal to target
            if (element==target){
                return true;
            }
        }
        // this line will execute when none of the above have executed
        // hence no element found
        return false;
    }

}
