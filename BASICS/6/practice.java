import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        // System.out.print("Enter Week Number: ");
        // int week = sc.nextInt();
        
        // System.out.print("Enter Number 2: ");
        // int num2 = sc.nextInt();

        // if (num1 >=100) {
        //     System.out.println("Positive Number: "+ num1);
        // }
        // else{
        //     System.out.print("Negative Number:"+num1);
        // }

        // switch (week) {
        //     case 1: System.out.println("Monday");break;
        //     case 2: System.out.println("Tuesday");break;
        //     case 3: System.out.println("Wednesday");break;
        //     case 4: System.out.println("Thursday");break;
        //     case 5: System.out.println("Friday");break;
        //     case 6: System.out.println("saturday");break;
        //     case 7: System.out.println("sunday");break;
        //     default: System.out.println("Wrong Input");
                
        // }


        System.out.print("Enter Year: ");
        int year = sc.nextInt();


        
        if (year % 4==0) {
            if (year % 100==0) {
                if (year%400==0) {
                    System.out.println("A Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("A Leap Year");
            }
        } 
        
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
    
}
