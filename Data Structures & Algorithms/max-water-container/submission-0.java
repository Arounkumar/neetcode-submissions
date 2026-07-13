class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxWater = 0;
        while (l < r) {
            int mw = (r - l) * Math.min(heights[l], heights[r]);
            maxWater = Math.max(maxWater, mw);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}
