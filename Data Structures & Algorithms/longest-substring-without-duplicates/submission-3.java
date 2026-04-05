class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2) return n;
        HashSet<Character> set = new HashSet<>();
        int j = 0;
        int res = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                res = Math.max(res,i-j);
                while(s.charAt(j)!=ch){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}
