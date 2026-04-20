class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        const smap = {}
        const tmap = {}
        let isAnagram = true
        if (s.length === t.length){
            for (let i=0; i< s.length; i++){
                 smap[s[i]] = smap[s[i]] ? (smap[s[i]]+1) : 1
                 tmap[t[i]] = tmap[t[i]] ? (tmap[t[i]]+1) : 1
            }

            for (const c in smap){
                if (smap[c] !== tmap[c]){
                    isAnagram = false
                    break
                }
            } 
            console.log(smap)
            console.log(tmap)
        return isAnagram
        }else {
            return false
        }
    }
}
