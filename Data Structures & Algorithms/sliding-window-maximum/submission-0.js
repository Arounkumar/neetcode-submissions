class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    maxSlidingWindow(nums, k) {
        const dq = [];
        const res = [];
        for (let i = 0; i < nums.length; i++) {
            if (dq.length && dq[0] < i + 1 - k) {
                dq.shift();
            }
            while (dq.length && nums[dq[dq.length - 1]] < nums[i]) {
                dq.pop();
            }
            dq.push(i);
            if (i + 1 >= k) {
                res.push(nums[dq[0]]);
            }
        }
        return res
    }
}
