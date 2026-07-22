
public class ReverseArray {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\n");
    }

    public static void reverseArray(int arr[]){
        int s =0, e=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(s<e){
                arr[s]=arr[s]+arr[e];
                arr[e]=arr[s]- arr[e];
                arr[s]= arr[s]-arr[e];
                s++;
                e--;
            }
            
        }
        System.out.println("Reverse Array is :");
        // printArray(arr);

    }

    public static void main(String[] arg){
        // try(Scanner sc = new Scanner(System.in)){

        // }
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Normal Array: ");
        printArray(arr);

        reverseArray(arr);

        printArray(arr);

    }
}
