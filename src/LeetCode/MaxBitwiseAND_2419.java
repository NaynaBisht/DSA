package LeetCode;

public class MaxBitwiseAND_2419 {
    public static void main(String[] args) {
        // Create an instance of the class containing longestSubarray method
        MaxBitwiseAND_2419 obj = new MaxBitwiseAND_2419();

        // Example array
        int[] nums = {1, 3, 5, 5, 2, 5, 5, 5, 1};

        // Call the method and print the result
        int result = obj.longestSubarray(nums);
        System.out.println("The length of the longest subarray with the maximum value is: " + result);
    }
    public int longestSubarray(int[] nums) {
        int mxm=0;
        for(int i=0; i<nums.length; i++){
            mxm = Math.max(mxm, nums[i]);
        }
        int cnt = 0;
        int ans = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==mxm){
                cnt++;
            }
            else{
                cnt=0;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
