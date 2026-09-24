public class Prblm7 {
    public static int firstOcc(int arr[],int key, int i){

        if(i == -1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        

        return firstOcc(arr, key, i--);
    }
    public static void main(String[] args) {
        int arr[] = {6,24,6,7,3,4,6,5};
        System.out.println(firstOcc(arr, 6, 0));

    }
}
