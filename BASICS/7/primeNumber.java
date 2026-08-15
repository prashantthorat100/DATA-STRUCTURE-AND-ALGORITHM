import java.util.Scanner;
public class primeNumber {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            

            if (n ==2) {
                System.out.println("Prime Number "+ n);
                
            }
            else{
                int i = 2;
                boolean isPrime = true;
                while(i <= Math.sqrt(n)){
                    if (n%i==0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }

            if (n ==1) {
                System.out.println("Number is "+ n);
            }
            else if(n ==0){
                System.out.println("Number is "+n);
            }
            else if(isPrime == true){
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is Composite");
            }

            }
            
            
        }
    }
}
