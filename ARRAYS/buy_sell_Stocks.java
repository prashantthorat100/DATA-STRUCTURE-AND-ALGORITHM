public class buy_sell_Stocks {
    public static int buy_sell(int prices[]){
        // maxProfit = maxSellingPrice - minBuyingPrice
        int minBuyingPrice = Integer.MAX_VALUE;
        // int maxSellingPrice = Integer.MIN_VALUE;
        int maxProfit =0;
        for(int i=0 ;i<prices.length;i++){
            if(minBuyingPrice < prices[i]){ //profit
                int profit = prices[i] - minBuyingPrice;//Today's Profit
                maxProfit = Math.max(maxProfit,profit );
            }
            else{
                minBuyingPrice = prices[i];
            }
            // return maxProfit;
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,5,4,3,2,1};
        System.out.print(buy_sell(prices));
    }
}
