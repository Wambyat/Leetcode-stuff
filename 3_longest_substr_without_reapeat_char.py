class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a=0
        len_subs=0
        subs=""
        for i in range(1,len(s)+1):
            subs=s[a:i]
            if len(set(subs)) == len(subs):
                len_subs=len(subs)
            else:
                a=a+1
        return len_subs