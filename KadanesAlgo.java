public class KadanesAlgo {
    public static void kadane(int arr[]){
        int currSum =0, maxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            // if(maxSum < currSum){
            //     maxSum= currSum;
            // }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum Subarray sum is: "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    } 
}
