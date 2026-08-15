import java.util.Scanner;

public class basic {
    public static void printHelloWorld(){
        System.out.print("Hello World");
    }
    public static int sum(int a, int b){
        int add = a + b;
        return add;
    }
    public static void main(String[] arg){
        // printHelloWorld();

        try(Scanner sc = new Scanner(System.in)){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(sum(num1, num2));;
            // System.out.println(additon);
        }
    }
}
 