public class BuynSell2{
    public static int buynsell_II(int prices[]){
        // [1,2,3,2,5,6]
        int totalProfit =0;
        int bp = Integer.MAX_VALUE;

        for(int i=1;i<prices.length;i++){
            int profit =0;
            if(prices[i]>prices[i-1]){
                profit = prices[i] - prices[i-1];
                totalProfit = totalProfit + profit;
            }

        }


        return totalProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("totalProfit is:" + buynsell_II(prices));

    }
}