import java.util.Scanner;

public class binToDec {
    
    public static void bin_dec(int n){
        int dec = 0, ld =0, num =n;
        for(int p = 0; n>0;p++){
            ld = n %10;
            dec = dec + (ld * (int)(Math.pow(2, p)));
            n = n/10;
        }
        System.out.print("Decimal Number for "+ num + " is :" + dec);
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            bin_dec(num);
        }
    }
}
