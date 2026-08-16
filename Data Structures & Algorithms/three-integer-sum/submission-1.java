class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            if(nums[i] > 0) break; 
            // why? next all number will be +ve and their sum will be > 0
            if(i > 0 && nums[i] == nums[i-1]) continue; // triplets already added
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                }else if( sum < 0){
                    l++;
                }else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    res.add(triplet);
                    l++;
                    r--;
                    //remove the duplicates
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }


        }
        return res;
    }
}
