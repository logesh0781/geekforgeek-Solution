class Solution {
    int minSubsets(int arr[]) {
        // code here
        Arrays.sort(arr);
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]+1) {
                c++;
                
            }
        }
        return c+1;
    }
}