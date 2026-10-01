public class Mergesort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge(int arr[],int s,int mid, int e){

        int temp[] = new int[e-s+1];
        int x = s;//iterator for left part
        int y = mid+1; //iterator for right part
        int z = 0;
        while(x<= mid && y<=e){
            if(arr[x]<arr[y]){
                temp[z] = arr[x];
                x++;
                z++;
            } else {
                temp[z] = arr[y];
                y++;
                z++;
            }
        }

        // left part
        while(x<=mid){
            temp[z++]= arr[x++];
        }

        // right part
        while(y<=e){
            temp[z++] = arr[y++];
        }

        // copy temp to original array
        for(z=0, x=s; z<temp.length; z++,x++){
            arr[x] = temp[z];
        }
    }
    public static void mergeSortfn(int arr[],int s, int e){
        if(s>=e){
            return;
        }
        // kaam
        int mid = s + (e-s)/2;
        mergeSortfn(arr,s,mid);//leftpart
        mergeSortfn(arr,mid+1,e);//rightpart
        merge(arr,s,mid,e);

    }
    public static void main(String[] args) {
        int arr[] = {5,3,6,8,2,1,9,0,0};// n = 8
        mergeSortfn(arr,0, arr.length-1);
        printArr(arr);
        // System.out.println(45/2);
    }
}
