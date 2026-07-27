public class KadaneForNeg {
    public static void kadane(int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<arr.length;i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Subarray Sum is : "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]= {-2,-3,4,-1,-2,1,5,-3};

        kadane(arr);
    }
}
