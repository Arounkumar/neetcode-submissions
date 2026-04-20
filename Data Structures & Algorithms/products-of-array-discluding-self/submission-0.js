class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let lprod = 1
        let result = new Array(nums.length).fill(1)
        nums.forEach((num,i) => {
           result[i] = lprod
            lprod = lprod * num
        })
        let rprod = 1
        for(let i = nums.length-1; i >-1 ; i--){
            result[i] = result[i] * rprod
            rprod = rprod * nums[i]

        }
        console.log(result)
        return result
    }
}
