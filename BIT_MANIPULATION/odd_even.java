import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if((num & 1)==1){
                System.out.println("Number is Odd");
            }else{
                System.out.println("Number is Even");
            }

        } 
    }
}
