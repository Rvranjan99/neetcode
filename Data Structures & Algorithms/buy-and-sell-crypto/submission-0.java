class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        int buy = 101;
        int sell = -1;
        int profit = 0;
        for(int price : prices){
            if(price < buy){
                buy = price;
                sell = price;
            }else{
                sell = price;
            }
            profit = Math.max(profit , sell - buy);
        }
        return profit;
    }
}
