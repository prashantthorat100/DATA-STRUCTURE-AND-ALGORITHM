public class insertionSort {
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    public static void insertsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev = i-1;
            // finding out correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertionSort
            arr[prev+1]= curr;
        
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};
        insertsort(arr);
        printArray(arr);
    }
}
