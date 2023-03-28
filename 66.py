class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        a = ''
        for i in digits:
            a +=str(i)
        num = int(a)
        num = num + 1
        digits = [int(i) for i in str(num)]
        return digits
