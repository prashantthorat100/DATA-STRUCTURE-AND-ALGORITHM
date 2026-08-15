import java.util.Scanner;

public class Practice {
    public static void main(String[]arg){
        try(Scanner sc = new Scanner(System.in)){
            // System.out.println("Enter Number: ");
            // int num = sc.nextInt();
            // int fact = 1;

            // for(int i=1; i<=num;i++){
            //     fact = fact * i;
            // }
            // System.out.println(fact);


            // Multiplication Table
            // System.out.print("Enter Number: ");
            // int n = sc.nextInt();

            // for(int i=1 ; i<=10;i++){
            //     System.out.println((n +" X " + i)+" = "+(n*i));

            // }
            // // System.out.println(i);


            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int sum = 0, temp = n, temp1 =n;
            double digit = 0;
            while(n!=0){
                int ld = n%10;
                digit = digit + 1;
                n /=10;
            }

            System.out.println("Digits " + digit);
            while(temp !=0){
                double ld = 0, c =1;
                ld = temp%10 ;
                c = Math.pow(ld, digit);
                sum = (int)(sum + c);
                temp = temp/10;
                
                
            }
            if (sum == temp1) {
                System.out.println("Armstrong Number");
            }
            else{
                System.out.println("Not an Armstrong Number");
            }

        }
    }
}
