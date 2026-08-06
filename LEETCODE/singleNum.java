public class singleNum {
    
    public static int singleNumber(int nums[]) {
        int x =nums[0];
        for(int i=1; i<nums.length;i++){
            x = nums[i] ^ x; 
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,4,4,2,1,8};
        System.out.println(singleNumber(arr));
    }

}
