class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] preMax = new int[n];
        int[] postMax = new int[n];
        preMax[0] = height[0];
        postMax[n-1] = height[n-1]; 
        for(int i = 1; i < n; i++){
            preMax[i] = Math.max(height[i],preMax[i-1]);
            postMax[n-i-1] = Math.max(height[n-i-1],postMax[n-i]); 
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            res += Math.min(preMax[i],postMax[i]) - height[i];
        }
        return res;
    }
}
