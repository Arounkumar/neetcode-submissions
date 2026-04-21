class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @return {boolean}
     */
    checkInclusion(s1, s2) {
        if (s1.length > s2.length){
            return false
        }
        const charcMap = new Map()
        let req = 0
        let left = 0
        for (let charc of s1 ){
            charcMap.set(charc, (charcMap.get(charc) || 0) + 1)
        }
        req = s1.length
        for (let right = 0 ; right< s2.length; right++){
            const charc = s2[right]
            if (charcMap.has(charc)){
                if (charcMap.get(charc) > 0){
                    req --
                }
                charcMap.set(charc, charcMap.get(charc) - 1)
            }
            if (right-left+1 > s1.length){
                const lchar = s2[left]
                if (charcMap.has(lchar)){
                    if (charcMap.get(lchar) >=0){
                        req ++
                    }
                    charcMap.set(lchar, charcMap.get(lchar) + 1)
                }
                left++
            }

            if (req === 0) {
                return true
            }
        }
        return false
    }
}
