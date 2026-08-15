public class PrefixSum{
    // array =[2,8,-4,10,4,7,-2],
    //  prefixSum = [2,10,6,16,20,27,25]
    // To find Sum of Subarray: sum =  prefix[end]-prefix[start-1];

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void prefixSum(int arr[]){
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // printArray(prefix);
        int Currsum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            Currsum =0;

            for(int j=i;j<arr.length;j++){
                if(i==0){
                    Currsum = prefix[j] ;
                }
                else{
                    Currsum = prefix[j]-prefix[i-1];
                }
                if (Currsum > maxSum) {
                maxSum = Currsum;
            }
            }

            

        }
        System.out.println("Maximum Subarray:" + maxSum);

    }

    
    public static void main(String[] args) {
        int arr[] = {2,8,-4,10,4,7,-2};
        prefixSum(arr);
    }
}