class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int k = Math.min(m,n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        sb.append(word1.substring(k)).append(word2.substring(k));
        return sb.toString();
    }
}