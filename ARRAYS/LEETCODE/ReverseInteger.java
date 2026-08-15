public class ReverseInteger{
    public static int reverse(int x) {
        int reverse =0;
        while(x!=0){
            int ld = x %10;
            
            // positive overflow
            if (reverse > Integer.MAX_VALUE / 10 ||
                (reverse == Integer.MAX_VALUE / 10 && ld > 7)) {
                return 0;
            }

            // Negative overflow
            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && ld < -8)) {
                return 0;
            }
            reverse = reverse*10 + ld ;
            x/=10;
        }
        
        return reverse;
    }

    public static void main (String[] args){
        System.out.println(reverse(1534236469));
        // System.out.println(Math.pow(2,31));
    }
}
