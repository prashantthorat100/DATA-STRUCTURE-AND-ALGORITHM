public class Prblm4 {
    public static int sumNum(int n){

        if(n ==1){
            return n;
        }
        n = n + sumNum(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNum(n));
    }
}
