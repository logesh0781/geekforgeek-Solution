class Solution {
    public int find(int[] arr) {
        // code here
        int r=0;
        for(int i=arr.length-1;i>=0;i--)
        r=(r+arr[i]+1)/2;
        return (r==0)?1:r;
    }
}
