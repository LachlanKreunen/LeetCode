class Solution {
    public boolean isSubsequence(String s, String t) {
        int sub = 0;
        for(int i = 0; i < t.length(); i++){
            if(sub < s.length()){
            if(t.charAt(i) == s.charAt(sub)){
                sub++;
            }
            }
        }
        return (sub == s.length());
    }
}