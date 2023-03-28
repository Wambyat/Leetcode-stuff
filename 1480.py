class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        a = 0
        b =[]
        for i in nums:
            a = a + i
            b.append(a)
        return b
