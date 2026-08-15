package ASSIGNMENTS;

public class qone{
    
    public static boolean appeartwice(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (i == arr.length-1) {
                    return false;
                }
                else if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        System.out.println(appeartwice(nums));
    }
}

