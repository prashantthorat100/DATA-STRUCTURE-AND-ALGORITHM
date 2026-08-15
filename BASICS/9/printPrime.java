public class printPrime {
    //Checks if number is Prime
    public static boolean isPrime(int n) {
        if(n == 2){
            return true;
        }
        else if(n ==1){
            return false;
        }
        else if(n ==0){
            return false;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }    
        }
        return true;
    }
    }

    // prints all primes in range
    public static void primeInRange(int n){

        for(int i=2;i<=n;i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(primeInRange(10));
        primeInRange(20);
    }
}
