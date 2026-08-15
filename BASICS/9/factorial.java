
import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        int fac = 1;
        for(int i=1;i<=n;i++){
            fac = fac * i ;
        }
        return fac;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            // System.out.print(fact(n));

            System.out.println("nCr: ");
            System.out.print(fact(n)/fact(r)* fact(n-r));
        }
    }
}
