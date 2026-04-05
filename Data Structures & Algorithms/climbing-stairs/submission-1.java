class Solution {
    public int climbStairs(int n) {
        int n1 = 1, n2 = 2;
        for(int i = 2;  i <= n; i++){
            int temp = n1;
            n1 = n2;
            n2 += temp;
        }
        return n1;
    }
}
