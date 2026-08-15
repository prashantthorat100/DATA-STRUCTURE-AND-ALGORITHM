import java.util.Arrays;
import java.util.Collections;
public class inbuildSort {
    public static void printArray(Integer arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Integer arr[] ={4,3,6,1,9,2};
        // Arrays.sort(arr,2,5);
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
