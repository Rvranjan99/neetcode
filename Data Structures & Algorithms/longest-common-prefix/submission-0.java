class Solution {
    private String helper(String s1, String s2){
        StringBuilder s = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        int i = 0;
        while(i<n && s1.charAt(i) == s2.charAt(i)){
            s.append(s1.charAt(i++));
        }
        return s.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String match = strs[0];
        for(int i = 1; i < strs.length; i++){
            match = helper(match,strs[i]);
            if(match.length() == 0) break;
        }
        return match;  
    }
}