public class subarrays {
    public static void subArrays(int arr[]){
        int tsa =0;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    sum = sum + arr[k];
                }
                System.out.print("    Sum of Subarray is : "+sum);
                tsa++;
                System.out.println();

            }
            System.out.print("\n");
        }
        System.out.println("Total subArrays are :"+ tsa);
    }


    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subArrays(arr);
    }
}
