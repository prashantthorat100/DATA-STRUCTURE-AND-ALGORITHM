import java.util.Stack;
public class Prblm01 {
    public static boolean validParentheses(String str){
        Stack <Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') {
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && str.charAt(i)==')' ||  s.peek()=='[' && str.charAt(i)==']' || s.peek()=='{' && str.charAt(i)=='}'){
                    s.pop();
                }else{
                    return false;
                }
            }

        }
        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "";
        System.out.println(validParentheses(str));
    }
}
