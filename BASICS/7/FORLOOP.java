import java.util.Scanner;

public class FORLOOP {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number to reverse:");
            int n = sc.nextInt();
            // for(int i=1 ; i<=n;i++){
            //     System.out.println("* * * * ");
            // }
            int reverse = 0;
            while(n!=0){
                int ld = n%10;
                // ld = ld *10;
                reverse = reverse*10 + ld;
                n=n/10;
            }
            System.out.println(reverse);
        }
        
    }
}
