class Solution {
    public boolean isAlphaNumeric(char c){
        return Character.isLetterOrDigit(c);
    }
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if(!isAlphaNumeric(lc)){
                l++;
            }
            else if(!isAlphaNumeric(rc)){ 
                r--;
            }
            else {
                if(Character.toLowerCase(lc)!= Character.toLowerCase(rc)) return false;
                l++;
                r--;
            }
        }
        return true;
    }
}
