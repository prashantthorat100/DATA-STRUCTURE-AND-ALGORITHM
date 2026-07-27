public class PrefixSum{
    // array =[2,8,-4,10,4,7,-2],
    //  prefixSum = [2,10,6,16,20,27,25]
    // To find Sum of Subarray: sum =  prefix[end]-prefix[start-1];

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void prefixSumSubArray(int arr[]){
        int copy[] = new int[arr.length];
        copy[0]= arr[0];
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            copy[i] = arr[i] + copy[i-1] ;
        } 
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                // sum = copy[j] - copy[i-1];
                if (i==0){
                    sum = copy[j];
                }
                else{
                    sum = copy[j]-copy[i-1];
                }
                if(maxSum<sum ){
                    maxSum = sum;
                }

            }
            
        }
        System.out.println("Maximum Sum of Subarray is :" + maxSum);
        printArray(copy);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        prefixSumSubArray(arr);
    }
}