class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const outputSet = new Set()
        let hasDup = false
        nums.forEach(num => {
            if (outputSet.has(num)){
                hasDup = true
                return
            }else {
                outputSet.add(num)
            }
        })
        return hasDup
    }
}
