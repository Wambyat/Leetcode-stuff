class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        res=[]
        temp=""
        for i in range(1,n+1):
            if i%3==0:
                temp = temp + "Fizz"
            if i%5==0:
                temp = temp + "Buzz"
            if i%3!=0 and i%5!=0:
                temp = str(i)
            res.append(temp)
            temp = ""
        return res
