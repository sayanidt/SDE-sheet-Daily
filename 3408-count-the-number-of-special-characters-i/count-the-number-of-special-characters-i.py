class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        chars= set(word)
        count=0

        for ch in "abcdefghijklmnopqrstuvwxyz":
            if ch in chars and ch.upper() in chars:
                count+= 1
        return count
        