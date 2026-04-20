class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const result = {}
        strs.forEach(str => {
            const arr = new Array(26).fill(0)

            for(let i =0 ; i<str.length; i++){
                const char = str.charCodeAt(i)
                arr[char- "a".charCodeAt(0)] = arr[char- "a".charCodeAt(0)] + 1
            }
            result[arr.join()] = result[arr.join()] ? [...result[arr.join()],str ] : [str]
            console.log(result)
        })
        return Object.values(result)
    }
}
