import java.util.Scanner;

public class dec_bin {
    public static void decToBin(int n){
        int num = n;
        int rem = 0;
        int binNum =0;

        for(int i =0;n>0;i++){
            
            rem = n%2;
            binNum = (binNum ) + (rem * (int)(Math.pow(10, i)));
            n = n /2;
        }

        System.out.println( "Binary of "+ num + " is: "+binNum);

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            // int avg = (int)(Math.avg());
            decToBin(n);

        }
    }
}
