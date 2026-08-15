import java.util.Scanner;
public class whileLOOP {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            int i=1, sum = 0;

            while( i <= num){
                sum = sum + i;
                i++;
            }
            System.out.println("Sum is :"+sum);
        }
    }
}
