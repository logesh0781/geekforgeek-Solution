class Solution {
    public int minMoves(int[] arr) {
        // code here
        int a=1;
        HashMap<Integer,Integer> f=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(f.containsKey(arr[i]-1)){
                f.put(arr[i],f.get(arr[i]-1)+1);
            }
            else
            f.put(arr[i],1);
            a=Math.max(a,f.get(arr[i]));
        }
        return arr.length-a;
    }
}