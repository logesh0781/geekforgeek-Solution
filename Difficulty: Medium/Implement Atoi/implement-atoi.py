class Solution:
    def myAtoi(self, s):
        # Code here
        s=s.lstrip()
        flag=False 
        j=0
        a=0
        if s[0]=='-' or s[0]=='+':
            j=1
        for i in range(j,len(s)):
            if s[i].isdigit():
                a=a*10+int(s[i])
            else:
                break
            
        if s[0]=='-':
            a=-a
        if a>=2**31-1:
            return 2**31-1
        elif a<=-2**31:
            return -2**31
        else:
            return a
        