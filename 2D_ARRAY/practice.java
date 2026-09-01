public class practice{
    public static int num(int arr[][], int n){
        int count=0 ;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==n){
                    count++;
                }
            }
        }

        return count;
    }
    public static void sum(int arr[][]){
        int sum = 0;
        for(int j=0;j<arr[0].length;j++){
            sum +=arr[1][j];
        }
        System.out.print(sum);
    }

    

    public static void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int arr[][]){
        int transpose[][] = new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        // printarr(arr);
        return transpose;
    }
    public static void main(String arg[]){
        int matrix[][]= {
            {4,7,6},
            {8,8,7}
        };
        // System.out.println(num(matrix, 6));
        // sum(matrix);
        // transpose(matrix);
        printarr(transpose(matrix));
    }
}