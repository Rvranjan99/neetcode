class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int j = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                j = Math.max(j,mp.get(ch)+1);
            }
            mp.put(ch,i);
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
