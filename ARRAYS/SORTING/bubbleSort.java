public class bubbleSort{
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
    }

    public static int[] bubblesort(int arr[]){
        boolean swapped = false;
        for(int i=0;i<arr.length-1;i++){
            swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j+1] = arr[j]+arr[j+1];
                    arr[j] = arr[j+1] -arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                    swapped = true;
                }
            }
            if(swapped == false){

                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,2,4};
        // System.out.println(bubblesort(arr));
        bubblesort(arr);
        printArray(arr);
        // int a;
        // System.out.println();
    }
}