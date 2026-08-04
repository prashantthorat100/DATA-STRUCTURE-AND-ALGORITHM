public class OptimisedPalindrome {
    public static boolean palindrome(int x){
        if(x<0 || (x%10==0 && x!=0 )){
            return false;
        }
        int reverse =0;
        while(x> reverse){
            reverse = reverse*10 + x%10;
            x/=10;
        }
        
        return x==reverse || x==reverse/10;
        

        
    }
    public static void main(String[] args) {
        System.out.println(palindrome(9));
    }
}
