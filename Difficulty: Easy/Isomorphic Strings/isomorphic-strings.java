class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        HashMap<Character, Character> c1=new HashMap<>();
        HashMap<Character, Character> c2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i),ch2=s2.charAt(i);
            if(!c1.containsKey(ch1) && !c2.containsKey(ch2)){
                c1.put(ch1,ch2);
                c2.put(ch2,ch1);
            }
            else if((c1.containsKey(ch1) && c1.get(ch1)!=ch2) || (c2.containsKey(ch2) && c2.get(ch2)!=ch1))
            return false;
        }
        return true;
    }
}