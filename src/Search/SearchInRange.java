package Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {1,2,75,15,20,88,-5,-23};
        int target = -5;
        int ans = linearSearch(num, target, 1, 4);
        System.out.println(ans);

        target = -5;
        ans = linearSearch(num, target, 4, 7);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i<=end; i++){
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
}
