class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lp = 1;
        int[] result = new int[nums.length];
        for(int i =0; i< nums.length; i++) {
            result[i] = lp;
            lp = lp * nums[i];
        }
        int rp = 1;
         for(int i =nums.length -1; i>=0 ; i--) {
            result[i] = result[i] * rp;
            rp = rp * nums[i];
        }
        return result;
    }
}  
