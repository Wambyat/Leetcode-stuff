class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        for i in ransomNote:
            if len(magazine)<1:
                return False
            if i in magazine:
                magazine = magazine.replace(i,'', 1)
            else:
                return False
        return True
