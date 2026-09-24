public class Prblm5 {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if( n ==1){
            return 1;
        }
        int nth = fibo(n-1) + fibo(n-2);
        return nth;
    }
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
