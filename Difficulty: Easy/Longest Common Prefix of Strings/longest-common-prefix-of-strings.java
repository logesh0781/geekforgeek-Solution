class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String str="";
        int n=arr.length;
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[n-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==last.charAt(i)){
                str+=first.charAt(i);
            }
            else
                break;
        }
        return str;
    }
}