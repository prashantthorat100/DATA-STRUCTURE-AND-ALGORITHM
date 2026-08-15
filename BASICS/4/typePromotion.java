import java.util.*;
public class typePromotion {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            
            byte b = 5;
            byte a =(byte) (b *2);
            System.out.print(a);
        }
    }
}
