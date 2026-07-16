public class SmallestNum {
        public static int smallestNumber(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int numbers[] = {1,4,6,2,56,87,23,11};
        int smallestNum = smallestNumber(numbers);
        System.out.println("Smallest Number is :"+ smallestNum);
    }
}
