
import java.util.Scanner;

public class Practice {
    public static void isPalindrome(int n){
        int num = n;
        int reverse = 0;
        for(int i=1; n>0;i++){
            int ld = n%10;
            reverse = reverse*10 + ld;
            n = n/10;
        }
        if (reverse == num ) {
            System.out.print("Number is Palindrome , Actual number :" + num + " Reverse Number: " + reverse);
        }
        else{
            System.out.println("Not a Palindrome Number");
        }

    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            isPalindrome(n);
        }
    }
}
