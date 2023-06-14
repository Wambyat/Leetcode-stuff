class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        op = []
        for i in range(numRows):
            op.append([])

        line_count = -1
        ascent = 1
        desent = 0
        # loop thru the word char by char. go to the end. then climb back up till 0. add to all.

        for i in s:
            
            if ascent == 0:
                line_count -= 1
                op[line_count].append(i)
            

            if desent == 0:
                line_count += 1
                op[line_count].append(i)

            if line_count == 0 and ascent == 0:
                ascent = 1
                desent = 0

            if line_count == numRows - 1:
                desent = 1
                ascent = 0
                continue
        
        #combine list of strings into one string
        op_str = ""
        for i in op:
            op_str += "".join(i)

        return op_str