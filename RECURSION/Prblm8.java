public class Prblm8 {
    
    public static int lastOcc(int arr[],int key, int i){

        if(i == -1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        

        return lastOcc(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,24,6,7,3,4,6,5};
        System.out.println(lastOcc(arr, 1, 7));

    }
}


