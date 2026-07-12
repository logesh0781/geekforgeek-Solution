class Solution:
    def maxWater(self, arr):
        # code here
        left_max=arr[0]
        right_max=arr[len(arr)-1]
        left_p=1
        right_p=len(arr)-2
        result=0
        
        while(left_p<=right_p):
            if(left_max<right_max):
                result+=max(0,left_max - arr[left_p])
                left_max=max(left_max,arr[left_p])
                left_p+=1
            else:
                result+=max(0, right_max-arr[right_p])
                right_max=max(right_max,arr[right_p])
                right_p-=1
        
        return result 
                