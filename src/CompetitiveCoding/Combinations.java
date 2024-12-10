package CompetitiveCoding;

public class Combinations {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int r = 2;
        printCombinations(arr,r);
    }
    static void printCombinations(int arr[], int r){
        int []data = new int[r];
        combination(arr, data, 0, 0, r);
    }
    static void combination(int[] arr, int[] data, int start, int index, int r){
        if (index==r){
            for(int i=0; i<r; i++){
                System.out.println(data[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i= start; i<arr.length; i++){
            data[index] = arr[i];
            combination(arr,data, i+1, index+1,r);
        }
    }
}
