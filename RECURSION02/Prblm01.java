public class Prblm01 {
    public static int tilingProblem(int n){// 2xn (floor size)

        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.print(tilingProblem(5
        ));
    }
}
