class Solution {
    public int majorityElement(int[] nums) {
        int w = -1;
        int count = 0 ;

        for(int num : nums){
            if(num == w){
                count++;
            }else{
               if(count == 0){
                    w = num;
                    count = 1;
               }else{
                count--;
               }
            }
        }
        return w;
    }
}