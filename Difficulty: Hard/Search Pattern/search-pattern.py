class Solution:
    def search(self, pat, txt):
        # code here
        arr=[]
        n=len(pat)
        for i in range(len(txt)):
            if txt[i:i+n] == pat:
                arr.append(i)
        return arr