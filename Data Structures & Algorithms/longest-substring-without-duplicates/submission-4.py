class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        sub_string_set = set()
        l = 0 
        r = 0
        max_substring = 0 

        while r < len(s):
            while s[r] in sub_string_set :
                sub_string_set.discard(s[l])
                l += 1
            sub_string_set.add(s[r])
            max_substring = max(max_substring, len(sub_string_set))
            r +=1   
        return max_substring