class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const complimentNum = {}
        for (let i=0; i< nums.length; i ++){
            const reqNum = target - nums[i]
                console.log(complimentNum, reqNum)
            if (reqNum in complimentNum) {
                return [i, complimentNum[reqNum]]
            }else {
                complimentNum[nums[i]] = i
            }
        }
        return []
    }
}
