class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Set<Character> cs = new HashSet();
        int op = 0;
        for (int r = 0; r < s.length(); r++) {
            while (cs.contains(s.charAt(r))) {
                cs.remove(s.charAt(l));
                l++;
            }
            cs.add(s.charAt(r));
            op = Math.max(op, r - l + 1);
        }
        return op;
    }
}
