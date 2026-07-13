class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int l=0;
        int r = l+1;
        while (r < prices.length){
            if (prices[r] > prices[l]) {
                int p = prices[r] - prices[l];
                mp = Math.max(mp, p);
            }else {
                l = r;
            }
            r++;
        }
        return mp;
    }
}
