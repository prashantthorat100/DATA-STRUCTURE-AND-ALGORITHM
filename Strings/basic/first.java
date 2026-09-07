import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // char arr[] = {'a','b','c','d'};
            // String str = "abcd";
            // String str1 = new String("xyz");

            // // Java Strings are Immutable
            // System.out.println(str);
            // System.out.println(str1);

            // String str2 = sc.nextLine();
            // System.out.println(str2);

            // String fullName = "Tony start";
            // System.out.println(fullName.length());

            // concatenation
            String firstName = "Prashant";
            String lastName = "Thorat";
            String fullName = firstName + " " + lastName;
            System.out.println(firstName.charAt(7 ));
            System.out.println(lastName.compareTo(firstName));

            System.out.println(firstName.equals(lastName));
        }
    }
}
