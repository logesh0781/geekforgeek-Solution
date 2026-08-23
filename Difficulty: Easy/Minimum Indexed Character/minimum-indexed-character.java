class Solution {
    public int minIndexChar(String s1, String s2) {
        // code here
        int a=s1.length();
        boolean flag=false;
        HashMap<Character,Integer> f=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(!f.containsKey(c)){
            f.put(c,i);
            }
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(f.containsKey(c)){
                flag=true;
                a=(a>f.get(c))?f.get(c):a;
            }
        }
        if(flag)
        return a;
        return -1;
    }
}