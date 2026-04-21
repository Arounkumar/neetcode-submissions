class Solution {
    /**
     * @param {number[]} height
     * @return {number}
     */
    trap(height) {
        let leftmax = 0
        let rightmax=0
        let left = 0
        let right = height.length - 1
        let trappedwater = 0 
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftmax) {
                    leftmax = height[left]
                }else {
                    trappedwater += leftmax - height[left]
                }
                left ++
            } else {
                if (height[right] > rightmax) {
                    rightmax = height[right]
                }else {
                    trappedwater += rightmax - height[right]
                }
                right --
            }
        }
        return trappedwater
    }
}
