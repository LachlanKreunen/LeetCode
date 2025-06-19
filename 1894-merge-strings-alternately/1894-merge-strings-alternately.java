class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merge = "";
        int i = 0;

        while(i < word1.length() && i < word2.length()){
            merge += word1.charAt(i);
            merge += word2.charAt(i);
            i++;
        }

        while(i < word1.length()){
            merge += word1.charAt(i);
            i++;
        }

        while(i < word2.length()){
            merge += word2.charAt(i);
            i++;
        }

        return merge;

    }
}