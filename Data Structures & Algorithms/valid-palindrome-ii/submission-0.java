class Solution {
    private boolean checkPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                String s1 = s.substring(0, l) + s.substring(l + 1);
                String s2 = s.substring(0, r) + s.substring(r + 1);
                return checkPalindrome(s1) || checkPalindrome(s2);
            }
            l++;
            r--;
        }
        return true;
    }
}