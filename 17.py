class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        """
        :type digits: str
        :rtype: List[str]
        """
        temp = []
        res = []
        aalt = []
        temp2 = []
        
        if len(digits) == 0:
            return res
        
        num_shit = {2:"abc",3:"def",4:"ghi",5:"jkl",6:"mno",7:"pqrs",8:"tuv",9:"wxyz"}

        for i in digits:
            aalt = [j for j in num_shit[int(i)]]
            if len(res) == 0:
                for j in aalt:
                    res.append(j)
            else:
                temp2 = []
                for j in res:
                    temp = [j+k for k in aalt]
                    temp2.extend(temp)
                res = temp2
        
        return res
