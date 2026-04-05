class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
        ArrayList<int[]> res = new ArrayList<>();
        for(int key: map.keySet()){
           res.add(new int[]{key,map.get(key)});
        }
        res.sort((a,b)->b[1] - a[1]);
        int ans[] = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = res.get(i)[0];
        }
        return ans;
        
    }
}
