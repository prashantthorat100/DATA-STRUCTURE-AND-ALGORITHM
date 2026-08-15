import java.util.Scanner;

public class do_while {
    public static void main(String [] arg){
        // try(Scanner sc = new Scanner(System.in)){
            
        //     do { 
        //         System.out.print("Enter Number: ");
        //         int a = sc.nextInt();
        //         if (a%10==0) {
        //             break;
        //         }
        //         System.out.println(a);
        //     } while(true);

        // }

        // for( int i =1; i<=5;i++){
        //     if (i==3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        try(Scanner sc = new Scanner(System.in)){
            do { 
                System.out.print("Enter Number: ");
                int num = sc.nextInt();

                if(num%10==0){
                    continue;
                }
                System.out.println(num);
            } while (true);
        }
    }
}
