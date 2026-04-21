class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        // pwwkew
        let left = 0
        let maxlength = 0 
        let charset= new Set()
        for (let r =0; r< s.length; r++){
            let charc = s[r]
            while (charset.has(charc)) {
                charset.delete(s[left])
                left ++
            }
            charset.add(charc)
            maxlength = Math.max(maxlength, r - left + 1)
        }
        return maxlength
    }
}
