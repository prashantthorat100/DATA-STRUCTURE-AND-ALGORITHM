import java.util.Scanner;
public class taxCalculator {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Annual Income:");
            int income = sc.nextInt();
        
            if (income < 500000) {
                System.out.println("0% Tax: " + (income*0));
            }
            else if (income >=500000 && income < 1000000) {
                System.out.println("20% Tax: " + (income*0.2));
            } else {
                System.out.println("30% Tax: " + (income * 0.3));
            }
        }
    }
}
