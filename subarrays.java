public class subarrays {
    public static void subArrays(int arr[]){
        int tsa =0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                int sum =0;
                
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    sum = sum + arr[k];
                }
                System.out.println("Sum of Subarray is : "+sum);
                if (max < sum) {
                    max = sum;
                }
                // System.out.println("");

            }
            System.out.print("\n");
        }
        System.out.println("Total subArrays are :"+ tsa);
        System.out.println("Max sum is "+ max);
    }


    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        subArrays(arr);
    }
}
