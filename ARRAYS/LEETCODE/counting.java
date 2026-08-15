class counting {
    public static int subarraySum(int[] nums, int k) {
        
        int sum =0, count =0; 
        for(int i=0;i<nums.length;i++){
            sum =0;
            for(int j=i;j<nums.length;j++){
                
                sum +=nums[j];
                if(sum ==k){
                    count++;
                }
            }
            
        }
        return count;
    
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1};
        System.out.println(subarraySum(arr, 3));

    }
}