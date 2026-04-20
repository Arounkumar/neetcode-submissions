class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const frqMap = {}
        nums.forEach(num => {
            frqMap[num] = frqMap[num] ? frqMap[num] +1  : 1
        })
        const ary = new Array(nums.length + 1).fill([])
        for (const num in frqMap){
            ary[frqMap[num]] = [...ary[frqMap[num]], num]            
        }

        let result = []
        console.log(ary)
        for (let i = ary.length -1 ; i >-1; i--){
            if (ary[i].length == 0){
                continue
            }
                result = [...result , ...ary[i]]
        }
        return result.slice(0,k)
    }

}
