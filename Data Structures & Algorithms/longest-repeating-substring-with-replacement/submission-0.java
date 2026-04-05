class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int j = 0;
        int res = 0;
        int maxf = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxf = Math.max(maxf,mp.get(ch));

            while((i-j+1) - maxf > k){
                mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                j++;
            }
            res = Math.max(res,(i-j+1));
        }
        return res;
    }
}
