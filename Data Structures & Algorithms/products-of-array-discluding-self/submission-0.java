class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int current = 1;
        for(int i = 0; i < n; i++){
            current*=nums[i];
            prefix[i] = current;
        }
        current = 1;
        for(int i = n-1; i >= 0; i--){
            current *= nums[i];
            suffix[i] = current;
        }

        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0){
                res[i] = suffix[1];
            }else if(i == n-1){
                // System.out.println(prefix[n-2]);
                res[i] = prefix[n-2];
            }else{
                res[i] = prefix[i-1]*suffix[i+1];
            }
            
        }
        // System.out.println(Arrays.toString(prefix));
        return res;

    }
}  
