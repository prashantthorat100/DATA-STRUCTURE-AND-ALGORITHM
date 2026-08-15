import java.util.*;
public class typeConversion {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){

            int a = 45;
            int b = a;
            int number = sc.nextInt();
            System.out.println(b);
            System.out.println(number);

            int marks = (int)(99.99f);
            System.out.println(marks);

            float f = 99.99f;
            System.out.println(f);

            char ch = 'A';
            int num = (int)(ch);
            System.out.println(num);
        }
    }
}
