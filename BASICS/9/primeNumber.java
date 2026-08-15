public class primeNumber {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n == 2){
            isPrime = true;
        }
        else if(n ==1){
            isPrime = false;
        }
        else if(n ==0){
            isPrime = false;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                isPrime = false;
                break;
            }
            
        }
    }

        
        return isPrime;

    }

    public static void main(String[] args) {
        System.out.print(isPrime(67));
    }
}
