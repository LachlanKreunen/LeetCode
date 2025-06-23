class Solution {
    public String reverseVowels(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> result = new ArrayList<>();
        char[] chars = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            char test = chars[i];
            for(int j = 0; j < vowels.length; j++){
                if(chars[i] == vowels[j]){
                    result.add(vowels[j]);
                    chars[i] = '\0';
                    break;
                }
            }
        }

        int counter = 0;
        if(result.size() > 0){
            for(int x = chars.length -1; x >= 0; x--){
                if(chars[x] == '\0'){
                    chars[x] = result.get(counter);
                    counter++;
                }
        }
        }
        

        return String.valueOf(chars);
    }
}