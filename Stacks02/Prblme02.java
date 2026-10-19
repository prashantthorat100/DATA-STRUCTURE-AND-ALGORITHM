import java.util.Stack;
public class Prblme02 {
    public static boolean isduplicateParentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch !=')'){
                s.push(ch);
            }else{
                int count =0;
                while(s.peek()!='(' && str.charAt(i)==')'){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate exist
                }else{
                    s.pop(); //Opening pair
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        String str1 = "((a+b) + (c-d))";
        System.out.println(isduplicateParentheses(str));
        System.out.println(isduplicateParentheses(str1));
    }
}
