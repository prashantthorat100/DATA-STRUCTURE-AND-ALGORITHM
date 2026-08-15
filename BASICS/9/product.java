import java.util.Scanner;

public class product {
    
    public static int product(int a,int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.print("Enter Number 1:");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2:");
            int num2 = sc.nextInt();
            System.out.print(product(num1, num2));
        }
    }
}
