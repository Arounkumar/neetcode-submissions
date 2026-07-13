class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int lm = 0;
        int rm = 0;
        int op = 0;
        while (l < r) {
            System.out.println(l + "" + r);
            if (height[l] < height[r]) {
                if (height[l] >= lm) {
                    lm = height[l];
                } else {
                    op = op + (lm - height[l]);
                }
                l++;
            } else {
                if (height[r] >= rm) {
                    rm = height[r];
                } else {
                    op = op + (rm - height[r]);
                }
                r--;
            }
        }
        return op;
    }
}
