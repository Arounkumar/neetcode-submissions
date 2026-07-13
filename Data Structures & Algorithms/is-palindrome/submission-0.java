class Solution {
    public boolean isPalindrome(String s) {
        String sc = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !isAlphanum(s.charAt(l))) {
                l++;
            }
            while (l < r && !isAlphanum(s.charAt(r))) {
                r--;
            }
            if (sc.charAt(l) != sc.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
            return true;
    }
    public boolean isAlphanum(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
    }
}
