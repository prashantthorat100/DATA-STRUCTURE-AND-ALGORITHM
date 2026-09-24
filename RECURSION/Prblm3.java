public class Prblm3 {
    public static int fact(int n){
        // int ans = 1;
        if(n==0){
            return 1;
        }
        n = n * fact(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}
