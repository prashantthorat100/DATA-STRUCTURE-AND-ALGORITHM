public class Quicksort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int arr[], int si, int ei){

        int pivot = arr[ei];
        int i = si-1;//jagah banana for smaller element than pivot element

        for(int j=si;j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int arr[], int si, int ei){

        if(si>=ei){
            return ;
        }
        // Pivot element ==>last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);//left part
        quickSort(arr, pIdx, ei);//right part

    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,8,2,1,9,0,0};// n = 8
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
