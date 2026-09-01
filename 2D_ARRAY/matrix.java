import java.util.Scanner;

public class matrix {
    public static boolean findValue(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.print("Found at index "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static int findMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int findMin(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n=3,m=3;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }
}
