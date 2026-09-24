public class Prblm2 {
    public static void printIncre(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncre(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        int n = 10;

        printIncre(n);
    }
}
