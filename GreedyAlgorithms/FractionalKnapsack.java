import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col = idx; 1st col = ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/ (double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int maxVal = 0;
        for(int i=val.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(W >= weight[idx]){
                maxVal = maxVal + val[idx];
                W = W - weight[idx];
            }else{
                maxVal = (int)(maxVal + (ratio[i][1]*W));
                W=0;
                break;
            }
        }
        System.out.println("Maximum Value is =>"+maxVal);
    }
}
