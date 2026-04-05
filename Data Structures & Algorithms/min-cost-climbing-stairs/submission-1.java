class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //space optimization
        int n = cost.length;
        int c1 = 0, c2 = 0;
        for(int i = 2; i <= n; i++){
            int temp = Math.min(c2+ cost[i-1], c1 + cost[i-2]);
            c1 = c2;
            c2 = temp;
        }
        return c2;
    }
}
