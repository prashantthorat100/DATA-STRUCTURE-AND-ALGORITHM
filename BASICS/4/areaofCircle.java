import java.util.*;
public class areaofCircle{
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            float pi = 3.14f;
            float r = sc.nextFloat();
            float a = pi * r * r;
            System.out.println("Area of Cirlce : "+ a);
        }
    }
}