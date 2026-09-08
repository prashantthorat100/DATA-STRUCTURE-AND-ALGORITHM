import java.util.Scanner;

public class powerOFTWO {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            if((num & num-1)==0){
                System.out.println("Number is Power of Two : "+num);
            }else{
                System.out.println("Number is not Power of two: "+ num);
            }
        }
    }
}
