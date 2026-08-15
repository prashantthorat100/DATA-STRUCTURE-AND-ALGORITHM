import java.util.Scanner;
public class star {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            // int n = sc.nextInt();

            // for(int i = 1; i<=n;i++){
            //     for(int j= 1; j<=i;j++){
            //         System.out.print(j + " ");
            //         // n--;
            //     }
            //     System.out.print("\n");
            // }
            char ch = 'A';
            int n = sc.nextInt();
            for(int i = 1; i<=n;i++){
                for(int j= 1; j<=i;j++){
                    System.out.print(ch);
                    // n--;
                    // ch++;
                }
                ch++;
                System.out.print("\n");
            }
        }
    }
}
