class Solution {
    public int lengthOfLongestSubstring(String s) {
        // abcdcaeda
        char[] inp = s.toCharArray();
        int op = 0;
        int l = 0;
        int r = 1;
        // Set<Charater> cs = new HashSet();
        String css = "";

        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        while (l < r && r < s.length()) {
            if (css.isEmpty()) {
                css = css + s.charAt(l);
            }
            while (l < r && r < s.length() && !css.contains(s.charAt(r) + "")) {
                css = css + s.charAt(r);
                r++;
            }
            op = Math.max(op, css.length());
            while (l < r && r < s.length() && css.contains(s.charAt(r) + "")) {
                l++;
                css = s.substring(l, r);
                System.out.println(l + "" + r);
            }
            if (l == r) {
                r++;
            }
        }
        return op;
    }
}
