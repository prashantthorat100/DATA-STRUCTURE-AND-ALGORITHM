public class binarySearch {
    public static int binSearch(int arr[], int k){
        int s = 0, e = arr.length -1;
        while(s <=e){
            int mid = s + (e-s)/2;
            if(k == arr[mid]){
                return mid;
            }
            else if(arr[mid] <k){
                s = mid + 1;
                // e = arr.length-1;
            }
            else if(k< arr[mid]) {
                // s = 0;
                e = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,9,10};
        int key = 1;
        System.out.println("Index is : "+ binSearch(arr, key));
    }
}
