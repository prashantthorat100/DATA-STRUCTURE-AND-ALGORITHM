public class Prblm9 {
    public static double pow(double x, int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1/(x*pow(x, n));
        }
        return x*pow(x, n-1);
    }

    public static int optimizedPower(int x, int n){//log(n)
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowersq = halfPower* halfPower;

        // n is odd
        if(n%2!=0){
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2,4 ));
    }
}
