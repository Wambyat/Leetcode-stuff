class Solution:
    def longestPalindrome(self, s: str) -> str:
        longest=""
        longest_temp=""
        longest_temp2=""
        #find a center first
        #if i-1==i+1 then "odd core"
        #if i==i+1 then "even core"
        #if both fail immediatly move to next
        #can be improved somehow
        if len(s)==1:
            return s
        if len(s)==2:
            if s[0]==s[1]:
                return s
        for i in range(1,len(s)-1):
            if s[i-1]==s[i+1]:
                longest_temp=s[i-1:i+2]
                print("odd:"+longest_temp)
                #odd core
                for j in range(2,i):
                    if s[i-j]==s[i+j]:
                        if len(s[i-j:i+j+1])>len(longest):
                            longest=s[i-j:i+j+1]
            
            if s[i-1]==s[i]:
                longest_temp2=s[i-1:i+1]
                print("even:"+longest_temp2)
                #even core
                for j in range(2,i):
                    print("\ns[i-j]:"+s[i-j]+"  >> s[i+j-1]:"+s[i+j-1])
                    if s[i-j]==s[i+j-1]:
                        if len(s[i-j:i+j])>len(longest):
                            longest=s[i-j:i+j]
        i=len(s)-1
        if s[i-1]==s[i]:
                longest_temp2=s[i-1:i+1]
                print(longest_temp2)
                if len(s[i-1:i+1])>len(longest):
                    longest=s[i-1:i+1]
        if len(longest_temp)>len(longest):
            longest=longest_temp
        if len(longest_temp2)>len(longest):
            longest=longest_temp2
        if longest=="":
            return s[0]
        return longest
