import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int marks = sc.nextInt();
            String result = (marks>=33)? "Pass": "Fail";
            System.out.println(result);
        }
    }
}