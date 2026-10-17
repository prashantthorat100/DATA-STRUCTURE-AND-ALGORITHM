import java.util.*;
public class Problem1 {

    // Problem 01 
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Problem02
    public static String reversestring(String str1){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i<str1.length()) {
            s.push(str1.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
        
    }


    // Problem03
    public static void reverseStack(Stack<Integer> s){
        // base case
        if(s.isEmpty()){
            return ;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
        
        
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s, 4);

        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        // Stack<String> st = new Stack<>();
        String name = "tnahsarP";
        System.out.println(reversestring(name));
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        
    }
}
