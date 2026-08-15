import java.util.Scanner;

public class practice {
    public static void main(String[] arg){

        // line Star
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number:");
        //     int n = sc.nextInt();

        //     for(int i=1;i<=n;i++){
        //         System.out.println("*");
        //     }
        // }

        // triangle star
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number:");
        //     int n = sc.nextInt();

        //     for(int i=1;i<=n;i++){
        //         for(int j = 1; j<=i;j++){
        //             System.out.print("* ");
        //         }
        //         System.out.print("\n");
        //     }

        // }


        //Inverted triangle
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i =1; i<=n;i++){
        //         for(int j=1; j<=n-i+1;j++){
        //             System.out.print("* ");
        //         }
        //         System.out.print("\n");
        //     }
        // }

        //Number triangle
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i =1; i<=n;i++){
        //         for(int j=1; j<=i;j++){
        //             System.out.print(j+ " ");
        //         }
        //         System.out.print("\n");
        //     }
        // }


        //    *
        //   **
        //  ***
        // ****
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i =1; i<=n;i++){
        //         for(int j=1; j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //         // System.out.print("\n");
        //         for(int k=1;k<=i;k++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        // }



        // *****
        //  ****
        //   ***
        //    **
        //     *
        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i =1; i<=n;i++){
        //         for(int j=1; j<=i-1;j++){
        //             System.out.print(" ");
        //         }
        //         // System.out.print("\n");
        //         for(int k=1;k<=n-i+1;k++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        // }



        // triangle 
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Number: ");

            int n = sc.nextInt();
            for(int i =1; i<=n;i++){
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
                }
                // System.out.print("\n");
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                // for(int l=1;l<=i-1;l++){
                //     System.out.print("*");
                // }
                System.out.print("\n");
            }
        }


        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        //     for(int i=1;i<=n-1;i++){
        //         for(int j=1;j<=n-i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        // }



        // try(Scanner sc = new Scanner(System.in)){
        //     System.out.print("Enter Number: ");

        //     int n = sc.nextInt();
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int k=1;k<=i;k++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        //     for(int i=1;i<=n-1;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int k=1;k<=n-i;k++){
        //             System.out.print("*");
        //         }
        //         System.out.print("\n");
        //     }
        // }


        // Hollow rectangle
        // try(Scanner sc = new Scanner(System.in)){
        //     int n = sc.nextInt();
        //     int m = sc.nextInt();

        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=m;j++){
        //             if(i==1 || j==1 || i==n || j==m){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.print("\n");
        //     }
        // }


        // try(Scanner sc = new Scanner(System.in)){
        //     int n = sc.nextInt();
        //     int m = sc.nextInt();

        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=m;j++){
        //             if(i==1 || j==1 || i==n || j==m){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.print("\n");
        //     }
        // }

        

    }
}
