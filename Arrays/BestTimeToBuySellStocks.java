package Arrays;

/**
 * BestTimeToBuySellStocks
 */
public class BestTimeToBuySellStocks {

    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;
        int current_profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy_price){
                buy_price = prices[i];
            }
            else{
                //check if we can get better profit
                current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}