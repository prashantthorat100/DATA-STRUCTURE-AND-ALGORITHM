public class LargestNum {
    public static int largestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
                
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,6,2,56,87,23,11};
        int largestNum = largestNumber(numbers);
        System.out.println("Largest Number is :"+ largestNum);
    }
}
