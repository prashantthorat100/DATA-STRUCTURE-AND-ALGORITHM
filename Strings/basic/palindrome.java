public class palindrome {

    public static boolean checkPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        String str = "noo";
        System.out.println(checkPalindrome(str));

    }
}

