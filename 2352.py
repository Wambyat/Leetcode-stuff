class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        other = []
        co = 0
        for i in range(len(grid)):
            other.append([row[i] for row in grid])
        for i in other:
            for j in grid:
                if i == j:
                    co+=1      
        return co