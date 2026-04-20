class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let output = ""
        strs.forEach(str => {
            output = output + str.length + "#" + str
        })
        return output
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        console.log(str)
        let  i = 0 
        const out = []
        while (i < str.length){
            console.log(i)
            let strLen = ""
            while(str[i] != "#") {
                strLen = strLen + str[i]
                i = i+1
            }
            const wordLength = parseInt(strLen)
            console.log(wordLength)
            console.log("wordLength", wordLength, str.slice(i+1, (wordLength)+i+1))
            out.push(str.slice(i+1, (wordLength)+i+1))
            i = (wordLength)+i+1
        }
        console.log(out)
        return out
    }
}
