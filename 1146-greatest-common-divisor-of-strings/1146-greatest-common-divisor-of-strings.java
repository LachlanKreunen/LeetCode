class Solution {

    private boolean divides(String word, String dividend){
        int newWord = word.length();
        int newDividend = dividend.length();
        if(newWord % newDividend != 0)
            return false;
        StringBuilder string = new StringBuilder();
        int times = newWord/newDividend;
        for( int i = 0; i < times; i++){
            string.append(dividend);
        }
        
        return string.toString().equals(word);
    }
    public String gcdOfStrings(String str1, String str2) {
        int min = Math.min(str1.length(),str2.length());

        for(int i = min; min >= 1; min--){
            String test = str1.substring(0,min);
            if(divides(str1, test) && divides(str2, test)){
                return test;
            }
        }
        return "";
    }
}