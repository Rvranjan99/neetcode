class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int j = 0, res = 0, freq = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count[ch - 'A']++;
            freq = Math.max(freq,count[ch-'A']);
            while((i-j+1)-freq > k){
                count[s.charAt(j) - 'A']--;
                j++;
            }
            res = Math.max(res,i-j+1);
        }
        return res;
    }
}
