class Solution {

     private boolean isVowel( char c){
            return "aeiouAEIOU".indexOf(c) != -1;
        }
        
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        int current = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i)))
                current ++;
        }

        int max = current;

        while(right < s.length()){
            if(isVowel(s.charAt(left))){
                current--;
            }

            if(isVowel(s.charAt(right))){
                current++;
            }

            left++;
            right++;

            if(current > max)
                max = current;
        }
        return max;
    }
}