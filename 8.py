def returner(res,neg):
    if neg == 1:
        if res > pow(2,31)-1:
            res = pow(2,31)-1
    
    elif neg == -1:
        temp_sad = -1
        if temp_sad*res < temp_sad*(pow(2,31)):
            res = pow(2,31)
    
    return res*neg
class Solution:
    def myAtoi(self, s: str) -> int:
        temp = 1
        sign = False
        res_mod = False
        res = 0
        neg = 1
        for i in s:
            if i == '-':
                if not sign:
                    neg = -1
                    sign = True
                    continue
                else:
                    return returner(res,neg)
            
            if i == "+":
                if not sign:
                    neg = 1
                    sign = True
                    continue
                else:
                    return returner(res,neg)

            if not (i == " " or i.isdigit()):
                return returner(res,neg)
            elif i == " ":
                if res_mod or sign:
                    return returner(res,neg)
                continue
            res = res*10
            res = res+int(i)
            res_mod = True
            sign = True

        return returner(res,neg)
