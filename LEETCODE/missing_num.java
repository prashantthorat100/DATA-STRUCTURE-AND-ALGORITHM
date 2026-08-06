public class missing_num {
    
   public static  int missingNumber(int nums[]) {
        int x =0;
        int y = 0;
        for(int i=0;i<nums.length;i++){
            x = nums[i] ^ x;
        }

        for(int i =0;i<=nums.length;i++){
            y = i ^ y;
        }
        return (x^y);
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(arr));
        System.out.println();

    }

}
