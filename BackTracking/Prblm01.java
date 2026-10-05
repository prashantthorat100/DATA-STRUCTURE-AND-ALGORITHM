public class Prblm01 {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void BackTrack(int arr[], int i, int v) {
        // base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursive case
        arr[i] = v;
        BackTrack(arr, i+1, v+1);
        arr[i] = arr[i]-2;

    }
    public static void main(String[] args) {
        int arr[] =  new int[5];
        BackTrack(arr, 0, 1);
        printarr(arr);
    }
}
