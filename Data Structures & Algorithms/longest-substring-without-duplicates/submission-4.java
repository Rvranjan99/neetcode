class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            res = Math.max(res,i - j + 1);
        }
        return res;
    }
}
